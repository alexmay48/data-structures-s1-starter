package com.learn.sort.sorters;

/**
 * Extends the quick sort algorithm to use the first element in each (sub) array
 * as the pivot.
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and extend (inherit) QuickSort. Fixing this and QuickSort should fix all existing errors.
public class QuickSortFirstPivot {

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Quick Sort - First Pivot.
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * First Pivot - <br>
	 * Choose the first element in the (sub) array as the pivot
	 */
	@Override
	protected int getPivot(Type[] array, int start, int mid, int end) {
		// FIXME: Return the correct pivot
	}

}
