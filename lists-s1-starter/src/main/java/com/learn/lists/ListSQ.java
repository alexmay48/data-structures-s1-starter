package com.learn.lists;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * This interface represents common actions done to Collections, whether they
 * are stacks, queues, bags, etc.
 * 
 * You are to implement this interface as a Generic Linked List and Array List
 * 
 * @author H. James de St. Germain, modified by Alex May
 */
public interface ListSQ<Type> {

	/**
	 * Add to the front of the list.
	 * 
	 * @param data - the element to add
	 */
	void addFirst(Type data);

	/**
	 * Add to the end of the list.
	 * 
	 * @param data - the element to add
	 */
	void addLast(Type data);

	/**
	 * Add to the middle of the list at the specified "index".
	 * <p>
	 * For {@link LinkedListSQ}, the "index" is similar to the index of an array.
	 * This means that "index" 0 would be the first element. So let's say we have a
	 * linked list that looks like the following: <br>
	 * [0]--> [1]--> [2]--> [3]--> null <br>
	 * addMiddle(2, 10) would place the value 10 where the 2 is, and shift the
	 * values to the right to look like the following: <br>
	 * [0]--> [1]--> [10]--> [2]--> [3]--> null
	 * <p>
	 * For {@link ArrayListSQ}, the "index" acts just like the index of an array.
	 * The difference is that the "index" may be different than the index of the
	 * "backing" array. So let's say the virtual (not backing) array looks like the
	 * following: <br>
	 * [0, 1, 2, 3] <br>
	 * addMiddle(2, 10) would place the value 10 where the 2 is, and shift the
	 * values to the right to look like the following: <br>
	 * [0, 1, 10, 2, 3]
	 * <p>
	 * One difference in our implementation of addMiddle compared to Java's is that
	 * if you try to addMiddle with an index that is "out of bounds", we won't throw
	 * an exception. You will simply add the element to the end of the list. So
	 * let's say we have a linked list that looks like the following: <br>
	 * [0]--> [1]--> [2]--> [3]--> null <br>
	 * addMiddle(8, 7) would place the value 7 at the end so the list looks like the
	 * following: <br>
	 * [0]--> [1]--> [2]--> [3]--> [7]--> null
	 * <p>
	 * For ArrayListSQ let's say the virtual (not backing) array looks like the following: <br>
	 * [0, 1, 2, 3] <br>
	 * addMiddle(8, 7) would place the value 7 at the end so the list looks like the
	 * following: <br>
	 * [0, 1, 2, 3, 7] <br>
	 * 
	 * @param index - The location in the list to place the element
	 * @param data  - the element to add
	 */
	void addMiddle(int index, Type data);

	/**
	 * Return the first element in the list.
	 * 
	 * @return - the first element
	 * @throws NoSuchElementException - if the list is empty
	 */
	Type getFirst() throws NoSuchElementException;

	/**
	 * Return the last element in the list.
	 * 
	 * @return - the last element
	 * @throws NoSuchElementException - if the list is empty
	 */
	Type getLast() throws NoSuchElementException;

	/**
	 * Return the element at the given "index".
	 * <p>
	 * For {@link LinkedListSQ}, the "index" is similar to the index of an array.
	 * This means that "index" 0 would be the first element. So let's say we have a
	 * linked list that looks like the following: <br>
	 * [0]--> [1]--> [10]--> [2]--> [3]--> null <br>
	 * get(2) would return the value 10.
	 * <p>
	 * For {@link ArrayListSQ}, the "index" acts just like the index of an array.
	 * The difference is that the "index" may be different than the index of the
	 * "backing" array. So let's say the virtual (not backing) array looks like the
	 * following: <br>
	 * [0, 1, 10, 2, 3] <br>
	 * get(2) would return the value 10.
	 * 
	 * @param index - the location in the list to return the element
	 * @return - the element at the specified location
	 * @throws NoSuchElementException - if there is no element at that index
	 */
	Type get(int index) throws NoSuchElementException;

	/**
	 * Remove all the elements and set the size to 0.
	 */
	void clear();

	/**
	 * Return true if the item is in the list. This will be an ITERATIVE
	 * implementation, not recursive.
	 * 
	 * @param item - the element or value to find
	 * @return - if the element is in the list
	 */
	boolean contains(Type item);

	/**
	 * Return true if the item is in the list. This will be a RECURSIVE
	 * implementation.
	 * <p>
	 * For {@link LinkedListSQ}, in order to do the recursion, you will create a
	 * helper method called: <br>
	 * private boolean containsRecursiveHelper(Type item, Node<Type> node) {...}
	 * <p>
	 * For {@link ArrayListSQ}, in order to do the recursion, you will create a
	 * helper method called: <br>
	 * private boolean containsRecursiveHelper(Type item, int start, int end) {...}
	 * <p>
	 * 
	 * @param item - the element or value to find
	 * @return - if the element is in the list
	 */
	boolean containsRecursive(Type item);

	/**
	 * Return the first element in the list, and also remove it from the list
	 * 
	 * @return - the first element that was in the list
	 * @throws NoSuchElementException - if the list is empty
	 */
	Type removeFirst() throws NoSuchElementException;

	/**
	 * Return the last element in the list, and also remove it from the list
	 * 
	 * @return - the last element that was in the list
	 * @throws NoSuchElementException - if the list is empty
	 */
	Type removeLast() throws NoSuchElementException;

	/**
	 * Return the length or size of the list. (non-recursive)
	 * 
	 * @return - the size of the list
	 */
	int size();

	/**
	 * With a single traversal of the list, in place, swap the order of the entire
	 * list, such that that which was last is first and that which was first is
	 * last. Do not create "extra space" with an "auxillary array" to reverse the
	 * list.
	 */
	void reverse();

	/**
	 * Return the length or size of the list.
	 * <p>
	 * For {@link LinkedListSQ}, determine the size of a list by RECURSIVELY
	 * traversing the list. In order to do the recursion, you will create a helper
	 * method called: <br>
	 * private int computeSizeRecursiveHelper(Node<Type> node) {...}
	 * <p>
	 * For {@link ArrayListSQ}, simply call the {@link ArrayListSQ#size()} method.
	 * 
	 * @return - the length of the list
	 */
	int computeSizeRecursive();

	/**
	 * Returns a JAVA {@link ArrayList} of the data in reverse order. <br>
	 * NOTE: This is JAVA's {@link ArrayList} we are returning, NOT our
	 * ArrayListSQ. <br>
	 * <p>
	 * For {@link LinkedListedSQ}, RECURSIVELY traverse the list, building up an
	 * ArrayList of the data. In order to do the recursion, you will create a helper
	 * method called: <br>
	 * public void toArrayListPostRecursion(ArrayList<Type> array, Node<Type> node)
	 * {...} <br>
	 * In the helper method, add the data to the array list AFTER the recursive
	 * call, thus "reversing" the list.
	 * <p>
	 * For {@link ArrayListSQ}, ITERATIVELY traverse the list, adding to Java's 
	 * ArrayList in a reverse manner. <br>
	 * 
	 * @return - Java's ArrayList that is reversed.
	 */
	ArrayList<Type> toArrayListPostRecursion();

	/**
	 * Returns a JAVA {@link ArrayList} of the data.<br>
	 * NOTE: This is JAVA's {@link ArrayList} we are returning, NOT our
	 * ArrayListSQ. <br>
	 * <p>
	 * ITERATIVELY traverse the list, building up an ArrayList of the data in
	 * order.<br>
	 * Do not use recursion for either {@link ArrayListSQ} or {@link LinkedListSQ}
	 * 
	 * @return - Java's ArrayList of the List.
	 */
	ArrayList<Type> toArrayList();
	

}
