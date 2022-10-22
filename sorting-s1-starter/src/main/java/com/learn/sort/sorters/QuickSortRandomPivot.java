package com.learn.sort.sorters;

import java.util.Random;

/**
 * Extends the quick sort algorithm to use a random element in the (sub) array
 * as the pivot.
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and extend (inherit) QuickSort. Fixing this and QuickSort should fix all existing errors.
public class QuickSortRandomPivot {

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Quick Sort - Random Pivot.
		return null;
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * Inplace Random Pivot - <br>
	 * Choose a random element in the sub array to choose as your pivot
	 */
	@Override
	protected int getPivot(Type[] array, int start, int mid, int end) {
		// FIXME: return the correct pivot
		return 0;
	}

}
