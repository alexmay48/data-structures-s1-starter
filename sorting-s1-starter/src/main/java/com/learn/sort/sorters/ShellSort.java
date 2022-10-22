package com.learn.sort.sorters;

/**
 * @author H. James de St. Germain
 * @date Spring 2007
 * 
 *       Code inspired by Mark Allen Weiss' code
 * 
 *       this is an implementation of the Shell Sort Routine
 *
 */
public class ShellSort<Type extends Comparable<? super Type>> implements Sorter<Type> {

	/**
	 * The choice of "gap" for shell sort
	 */
	double GAP = 2.2;

	/**
	 * The name of the sort
	 */
	public String nameOfSort() {
		return "Shell Sort using a gap of " + this.GAP;
	}

	/**
	 * For details on Shell Sort, see the Text or google
	 * 
	 * @param array the values to sort from small to high
	 */
	private void shellSort(Type[] array) {
		int gap = array.length / 2;

		while (gap > 0) {
			for (int i = gap; i < array.length; i++) {
				Type tmp = array[i];
				int j = i;
				while (j >= gap && tmp.compareTo(array[j - gap]) < 0) {
					Sorter.swap(array, j, j - gap);
					j -= gap;
				}
			}

			// change the gap value to a smaller value
			if (gap == 2) {
				gap = 1;
			} else {
				gap = (int) (gap / this.GAP);
			}
		}

	}

	/**
	 * Allow the gap to be changed more time testing
	 */
	public void setConstant(double constant) {
		this.GAP = constant;
	}

	@Override
	public void sort(Type[] array) {
		shellSort(array);
	}

	@Override
	public ComplexityClass getExpectedComplexityClass() {
		return ComplexityClass.N_SQUARED;
	}

}
