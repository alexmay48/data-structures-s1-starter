package com.learn.lists;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedListSQ<Type> implements ListSQ<Type> {

	private int size = 0;

	@Override
	public void addFirst(Type data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLast(Type data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMiddle(int index, Type data) {
		// TODO Auto-generated method stub

	}

	@Override
	public Type getFirst() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type getLast() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type get(int index) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean contains(Type item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsRecursive(Type item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Type removeFirst() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Type removeLast() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
	}

	@Override
	public int computeSizeRecursive() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Type> toArrayListPostRecursion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Type> toArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * LinkedListSQ will have the return String look like this:<br>
	 * Empty: <br>
	 * "null" <br>
	 * One Element: <br>
	 * "[0]--> null" <br>
	 * Many Elements: <br>
	 * "[0]--> [1]--> [2]--> null" <br>
	 * 
	 * See the toString method within the Node class.
	 */
	@Override
	public String toString() {
		// FIXME: Return a linked List toString correctly.
		return null;
	}

	/**
	 * Pictorially, a node is: <br>
	 *
	 * data next <br>
	 * 
	 * [5] --> <br>
	 * Note, while a 5 is used above any "Type" could be contained in the node
	 */
	static class Node<Type> {
		Type data;
		Node<Type> next;

		Node(Type theData, Node<Type> afterMe) {
			this.data = theData;
			this.next = afterMe;
		}

		/**
		 * This method must be implemented using recursion
		 *
		 * Creates a string that describes the current node and all following nodes, for
		 * example, a list of the nubmers 0, 1, 2, 3 would print as:
		 * 
		 * "[0]--> [1]--> [2]--> [3]--> null"
		 *
		 * WARNING: the syntax must be exact. "open square bracket, data, close square
		 * bracket, hyphen, hyphen, greater than, space, ... null"
		 *
		 * @return - a String representation of this chain of nodes
		 */
		public String toString() {
			// FIXME: Implement
			return null;
		}
	}

}
