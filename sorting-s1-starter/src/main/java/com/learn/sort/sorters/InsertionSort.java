package com.learn.sort.sorters;

/**
 * Implements the insertion sort algorithm.
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and implement Sorter. This should fix all existing errors.
public class InsertionSort {

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Insertion Sort.
		return null;
	}

	/**
	 * {@inheritDoc} <br>
	 * 
	 * This will have no affect on insertion sort itself.
	 */
	@Override
	public void setConstant(double constant) {
		System.out.println("This is ignored for insertion sort");
	}

	/**
	 * {@inheritDoc} <br>
	 * The actual insertion sort code is written in the
	 * {@link InsertionSort#insertionSort(Comparable[], int, int)} method because it
	 * can be used in other sorts. This will call that method to sort the entire
	 * array.
	 */
	@Override
	public void sort(Type[] array) {
		// FIXME: You can simply call the insertionSort method below with the correct
		// parameters.
	}

	/**
	 * My hypothesis for what I think Insertion Sort's BIG O should be.
	 * 
	 * @return - The expected complexity for Insertion Sort
	 */
	@Override
	public ComplexityClass getExpectedComplexityClass() {
		// FIXME: Return what complexity you expect.
		return null;
	}

	/**
	 * The Insertion Sort algorithm. This is an in-place insertion sort that works
	 * on the VIRTUAL array defined by the actual array from [start --> end] (end is
	 * inclusive)
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @param array  - The array to sort
	 * @param start  - The start of the section of the array to sort
	 * @param end    - The end of the section of the array to sort (inclusive)
	 */
	public static <Type extends Comparable<? super Type>> void insertionSort(Type[] array, int start, int end) {
		// FIXME: Write the insertionSort algorithm.
	}

}
