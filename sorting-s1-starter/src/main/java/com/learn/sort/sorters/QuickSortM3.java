package com.learn.sort.sorters;

/**
 * Extends the quick sort algorithm to use the median element of the start,
 * middle, and end elements in each (sub) array as the pivot.
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and extend (inherit) QuickSort. Fixing this and QuickSort should fix all existing errors.
public class QuickSortM3 {

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Quick Sort - Median of 3.
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * Median of 3 - <br>
	 * Compare the elements from the array (start, mid, end) and return the index of
	 * the median of the values of those elements. You will swap the values in the
	 * quick sort algorithm.
	 */
	@Override
	protected int getPivot(Type[] array, int start, int mid, int end) {
		// FIXME: Return the correct pivot
		return 0;
	}

}
