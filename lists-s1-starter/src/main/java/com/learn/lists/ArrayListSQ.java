package com.learn.lists;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListSQ<Type> implements ListSQ<Type> {

	private int size = 0;
	private int first = 0;
	private int last = 0;
	private Object backingStore[] = new Object[4];

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
	 * ArrayListSQ will have the return String look like this: <br>
	 * Empty: <br>
	 * "[]" <br>
	 * One Element: <br>
	 * "[0]" <br>
	 * Many Elements: <br>
	 * "[0, 1, 2]" <br>
	 */
	@Override
	public String toString() {
		// FIXME: Return an array list toString correctly.
		return null;
	}

	/*
	 * NON OVERRIDDEN METHODS:
	 * 
	 * Along with the provided methods, write any of your own methods here.
	 */

	/**
	 * 
	 * Helper method to make sure that the position of the first and last pointers
	 * of the queue stay within the bounds of the array.<br>
	 * 
	 * This calls the static bound method so that it is easier to use JUnit test on,
	 * and doesn't require to pass the backingStore array each time.
	 * 
	 * @param position
	 * @return the start and end of the array within the bounds of queue in the
	 *         array.
	 * 
	 */
	private int bound(int position) {
		return bound(position, backingStore);
	}

	/**
	 * 
	 * Psuedocode: If position between 0 and length-1, return position If position
	 * is negative, subtract from length If position is greater than length-1,
	 * return position modula length
	 * 
	 * @param position
	 * @param backingStore
	 * @return the position in the backing array within the bounds of the backing
	 *         array
	 */
	public static int bound(int position, Object[] backingStore) {
		// FIXME: Implement the method here. If you choose not to use this, simply add a
		// suppress message to the other bound method and remove the fixme here.
		return 0;
	}

	/**
	 * 
	 * Helper method to shift all of the elements after the given index in order to
	 * insert an element into the middle of an array.
	 * 
	 * @param index - the index that will indicate where to shift all of the
	 *              elements to the right.
	 * 
	 */
	public void shift(int index) {

	}

}
