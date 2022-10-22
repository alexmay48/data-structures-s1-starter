package com.learn.sort.sorters;

import java.util.Arrays;
import java.util.Comparator;

/**
 * A wrapper class which implements Java's sorting algorithm on an array. This
 * is used to compare to the sorts that we will write
 * 
 *
 * @param <Type> - Must be a comparable object for sorting purposes
 */
//FIXME: Make Generic and implement Sorter. This should fix all existing errors.
public class JavaSort {

	/**
	 * {@inheritDoc} <br>
	 * This uses the Java Arrays built in sort and the natural order comparator.
	 */
	@Override
	public void sort(Type[] array) {
		// FIXME: Call Java's sort algorithm in the Arrays library using the
		// naturalOrder comparator
	}

	@Override
	public String nameOfSort() {
		// FIXME: Return the name of the sort, in this case, Java's Sort.
		return null;
	}

	/**
	 * {@inheritDoc} <br>
	 * 
	 * This will have no affect on Java's Sort itself.
	 */
	@Override
	public void setConstant(double constant) {
		System.out.println("Java's sorting algorithm");
	}

	/**
	 * My hypothesis for what I think Java's sort BIG O should be.
	 * 
	 * @return - The expected complexity for Java's sort
	 */
	@Override
	public ComplexityClass getExpectedComplexityClass() {
		// FIXME: Return what complexity you expect.
		return null;
	}

}
