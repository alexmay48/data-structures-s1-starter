package com.learn.sort;

import java.util.ArrayList;

import com.learn.sort.sorters.*;
import com.learn.sort.utils.Constants;
import com.learn.sort.utils.SortUtils;

/**
 * Application to use the SortUtil class to test and time the different sorting
 * algorithms
 * 
 * @author Alex May
 */
public class SortingMain {

	public static void main(String[] args) {

		Constants.loadProperties();

		ArrayList<Sorter<Integer>> sortMethods = new ArrayList<>();
		SortUtils util = new SortUtils();

		/*
		 * NOTE: Change the application.properties file to change the boolean values.
		 */
		if (Constants.INSERTION)
			sortMethods.add(new InsertionSort<Integer>());
		if (Constants.SHELL)
			sortMethods.add(new ShellSort<Integer>());
		if (Constants.JAVA)
			sortMethods.add(new JavaSort<Integer>());
		if (Constants.MERGE)
			sortMethods.add(new MergeSort<Integer>());
		if (Constants.QUICK_FIRST_PIVOT)
			sortMethods.add(new QuickSortFirstPivot<Integer>());
		if (Constants.QUICK_RANDOM_PIVOT)
			sortMethods.add(new QuickSortRandomPivot<Integer>());
		if (Constants.QUICK_MEDIAN_THREE_PIVOT)
			sortMethods.add(new QuickSortM3<Integer>());

		/*
		 * NOTE: Go through each of the sorts added above. Try out different values for
		 * the testAndTime method. You will want to test much larger values than these
		 * for your analysis document. When testing the large numbers, you will want to
		 * test insertion sort separately, and not in this for loop because insertion
		 * sort will take too long with the large values.
		 */
		for (Sorter<Integer> sort : sortMethods) {
			util.testAndTime(sort);
		}

		/*
		 * NOTE: If you get to it, these will test what cutoff values do to to merge and
		 * quick sort.
		 */
		if (Constants.RUN_MERGE_CUTOFF) {
			MergeSort<Integer> mergeSortCutoffTest = new MergeSort<Integer>();
			util.timeConstantChange(mergeSortCutoffTest, 1, 2, 50, 50_000);

		}
		if (Constants.RUN_QUICK_CUTOFF) {
			QuickSortM3<Integer> quickSortCutoffTest = new QuickSortM3<Integer>();
			util.timeConstantChange(quickSortCutoffTest, 1, 2, 50, 50_000);
		}

	}

}
