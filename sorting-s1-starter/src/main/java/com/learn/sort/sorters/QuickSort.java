package com.learn.sort.sorters;

/**
 * This code is an abstract base class for all versions of quick sort.
 * 
 * Write Quick sort using a single array and doing it in place
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and implement Sorter. This should fix all existing errors.
public abstract class QuickSort {

	/**
	 * Have a value for switching over to insertion sort
	 */
	double cutoff = 3;

	/**
	 * Choose an index in the array to use the value in that location as the pivot.
	 * The pivot location will be used to swap the first value in the array. Each
	 * Quick Sort will apply this differently.
	 * 
	 * @param array - The array to sort. (We only sort a sub piece of the array)
	 * @param start - The start position in the (sub) array
	 * @param mid   - The middle position in the (sub) array
	 * @param end   - The end position in the (sub) array
	 * @return - The index to swap to use as the value as pivot
	 */
	protected abstract int getPivot(Type[] array, int start, int mid, int end);

	/**
	 * Given an array, partition the array such that all the elements lower than or
	 * equal to the pivot are on the left, all the elements greater than the pivot
	 * are on the right.
	 * 
	 * @param array - Data data to sort
	 * @param left  - The start index of the sub array (inclusive)
	 * @param right - The end index of the sub array (inclusive)
	 * 
	 * @return - The location of the pivot
	 */

	protected int partition(Type[] array, int left, int right) {
		// FIXME: Write the code for partition here
		return 0;
	}

	/**
	 * The Quick Sort Algorithm on an Array. <br>
	 * 
	 * <ol>
	 * <li>Check for single array element
	 * <li>Choose a pivot (store in first bucket for convenience)
	 * <li>Partition:
	 * <ul>
	 * <li>Move all elements higher than the pivot to the right side of the array
	 * <li>Move all elements lower than the pivot to the left side of the array
	 * </ul>
	 * <li>Put the pivot back between upper and lower group
	 * <li>Sort left side
	 * <li>Sort right side
	 * </ol>
	 * Warning: Don't sort pivot again.
	 * 
	 * @param array - Data to be sorted
	 * @param start - Is the index of the beginning element
	 * @param end   - Is the index of the last element
	 */
	private void quickSort(Type[] array, int start, int end) {
		// FIXME: Write the quickSort algorithm
	}

	@Override
	public void sort(Type[] array) {
		// FIXME: Call the quickSort algorithm to sort the array
	}

	@Override
	public abstract String nameOfSort();

	/**
	 * {@inheritDoc} <br>
	 * 
	 * Allow the insertion sort cut off to be changed for merge sort. Always greater
	 * than 3
	 */
	@Override
	public void setConstant(double constant) {
		this.cutoff = constant;
	}

	/**
	 * My hypothesis for what I think Quick Sort's BIG O should be.
	 * 
	 * @return - The expected complexity for Quick Sort
	 */
	@Override
	public ComplexityClass getExpectedComplexityClass() {
		// FIXME: Return what complexity you expect.
		return null;
	}

}
