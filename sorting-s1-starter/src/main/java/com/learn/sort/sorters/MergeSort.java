package com.learn.sort.sorters;

import com.learn.sort.utils.SortUtils;

/**
 * Implements the merge sort algorithm.
 * 
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and implement Sorter. This should fix all existing errors.
public class MergeSort {

	/**
	 * Have a value for switching over to insertion sort
	 */
	double cutOff = 7;

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Java's Sort.
		return null;
	}

	/**
	 * Merge Sort
	 * <ol>
	 * <li>Check for single element array
	 * <li>Split array in half
	 * <li>Merge sort left
	 * <li>Merge sort right
	 * <li>Merge left and right
	 * </ol>
	 * 
	 * @param array     - The array to sort
	 * @param auxillary - The auxiliary array to help us sort.
	 * @param low       - The index of the starting value in the "virtual array"
	 * @param high      - The index of the ending value in the "virtual array"
	 *                  (inclusive)
	 */
	private void mergeSort(Type[] array, Type[] auxiliary, int low, int high) {
		// FIXME: Write the mergeSort algorithm
	}

	/**
	 * Merge or combine the "sub arrays" in the array parameter defined by the
	 * indexes. Use the auxiliary parameters for "scratch" space.
	 * 
	 * 
	 * @param array     - The array of original values to sort
	 * @param auxillary - The auxiliary array used as spare space to help sort
	 * @param low       - low to mid indexes is the "lower" sub array
	 * @param mid       - The index that divides the the two "halves"
	 * @param high      - mid to high indexes is the "upper" sub array
	 */
	private void merge(Type[] array, Type[] auxillary, int low, int mid, int high) {
		// FIXME: Write the merge algorithm
	}

	/**
	 * {@inheritDoc} <br>
	 * 
	 * Allow the insertion sort cut off to be changed for merge sort
	 */
	@Override
	public void setConstant(double cutoff) {
		this.cutOff = cutoff;
	}

	@Override
	public void sort(Type[] array) {
		// These tricky lines of code is creating a new generic array for you...
		@SuppressWarnings("unchecked")
		Type[] auxiliary = (Type[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(),
				array.length);

		// FIXME: Start the merge sort algorithm
	}

	/**
	 * My hypothesis for what I think Merge Sort's BIG O should be.
	 * 
	 * @return - The expected complexity for Merge Sort
	 */
	@Override
	public ComplexityClass getExpectedComplexityClass() {
		// FIXME: Return what complexity you expect.
		return null;
	}

}
