package com.learn.sort.sorters;

/**
 * This interface allows a sort routine to be tested by turning the sort into a
 * "functor". All the sorts of interest must be created to follow the functions
 * required by this interface.
 * 
 * @author H. James de St. Germain - Edited by Alex May
 */
public interface Sorter<Type extends Comparable<? super Type>> {

	/**
	 * Put the array list in order from smallest to largest
	 * 
	 * @param array - An array of comparable objects to sort
	 */
	public abstract void sort(Type[] array);

	/**
	 * For testing and other purposes, get the name of the sort
	 * 
	 * @return - The name of the sort
	 */
	public abstract String nameOfSort();

	/**
	 * If you want to change the behavior of the sort. <br>
	 * e.g. For quick and merge sort, changing the insertion sort cutoff <br>
	 * e.g. For shell sort, the gap size.
	 * 
	 * @param constant - any one constant in an algorithm
	 */
	public default void setConstant(double constant) {
		// the default case is to do nothing....
	}

	/**
	 * Return the expected complexity class of the sort. <br>
	 * For example, NLogN, NSquared, etc.
	 * 
	 * @return the expected complexity class of the sort
	 */
	public abstract ComplexityClass getExpectedComplexityClass();

	/**
	 * Swaps the given two values in the array. In all of the code, use this swap
	 * method.
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @param array  - The array where the swapping will take place
	 * @param from   - An index to swap an element
	 * @param to     - An index to swap an element
	 */
	public static <Type> void swap(Type[] array, int from, int to) {
		// FIXME: Write the swap code here
	}

}
