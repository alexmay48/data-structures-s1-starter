package com.learn.sort.utils;

import java.text.MessageFormat;

import com.learn.sort.sorters.ComplexityClass;
import com.learn.sort.sorters.Sorter;

/**
 * Methods for generating test data, testing sortedness, timing, etc.
 */
public class SortUtils {

	// Create two fields to store start time and end time values
	long startTime;
	long endTime;

	/**
	 * Test to make sure an array is sorted from smallest to largest
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @param array  - The array to check if it's sorted
	 * @return - If the array is sorted
	 */
	public static <Type extends Comparable<? super Type>> boolean isSorted(Type[] array) {
		// FIXME: can just call isSorted below.
		return false;
	}

	/**
	 * Test to make sure an array is sorted from largest to smallest
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @return - If the array is sorted in reverse order
	 */
	public static <Type extends Comparable<? super Type>> boolean isReverseSorted(Type[] array) {
		// FIXME: can just call isReverseSorted below.
		return false;
	}

	/**
	 * Test to make sure an array is sorted from smallest to largest
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @param array  - The array to check if it's sorted
	 * @param start  - The beginning element of the section of the array to check
	 * @param end    - The end element of the section of the array to check (This is
	 *               exclusive)
	 * @return - If the array is sorted
	 */
	public static <Type extends Comparable<? super Type>> boolean isSorted(Type[] array, int start, int end) {
		// FIXME: implement
		return false;
	}

	/**
	 * Test to make sure an array is sorted from largest to smallest
	 * 
	 * @param <Type> - The array passed must be an object that implements Comparable
	 * @param array  - The array to check if it's sorted
	 * @param start  - The beginning element of the section of the array to check
	 * @param end    - The end element of the section of the array to check (This is
	 *               exclusive)
	 * @return - If the array is sorted in reverse order
	 */
	public static <Type extends Comparable<? super Type>> boolean isReverseSorted(Type[] array, int start, int end) {
		// FIXME: implement
		return false;
	}

	/**
	 * Test to (kind of) make sure two integer arrays contain the same values. Do
	 * this by checking if the sum of the values in the two arrays. This is an
	 * approximation to the question: do the two arrays contain the same elements.
	 * This is used when you are concerned the sort may be "clobbering" data.
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static boolean sumEquals(Integer[] array1, Integer[] array2) {
		// FIXME: Implement
		return false;
	}

	/**
	 * Generate an array of 'size' which is already sorted
	 * 
	 * @param size - The size of the array to create
	 * @return
	 */
	public static Integer[] generateSortedArray(int size) {
		// FIXME: Implement
		return null;
	}

	/**
	 * Generate an array of 'size' which is in reverse order largest to smallest
	 * 
	 * @param size - The size of the array to create
	 * @return
	 */
	public static Integer[] generateReverseSortedArray(int size) {
		// FIXME: Implement
		return null;
	}

	/**
	 * Generate an array of 'size' that has random elements with values from 0 to
	 * max
	 * 
	 * @param size - The size of the array to create
	 * @param max
	 * @return
	 */
	public static Integer[] generateRandomArray(int size, int max) {
		// FIXME: Implement
		return null;
	}

	/**
	 * Generate an array of 'size' that has all the same element
	 * 
	 * @param size    - The size of the array to create
	 * @param element
	 * @return
	 */
	public static Integer[] generateSameArray(int size, int element) {
		// FIXME: Implement
		return null;
	}

	/*
	 * ******************************* TIMING CODE *******************************
	 * You should not need to modify the code below. You might modify it to add
	 * print statements or sumEquals or different checks like that, but it is
	 * otherwise unnecessary
	 */

	/**
	 * This function will call the implemented sorted routines and time them. It
	 * will check already sorted arrays, reverse sorted arrays, random value arrays,
	 * and the same value arrays
	 *
	 * 
	 * @param sortRoutine - the routine to test
	 */
	public void testAndTime(Sorter<Integer> sortRoutine) {
		System.out.printf("Sorting Using %s:%n", sortRoutine.nameOfSort());
		System.out.printf("Time Analysis: %n");
		System.out.printf("\t\t\t\t\t\tRandom * 10e6 vs.\tWorst Case * 10e6 vs. %n");
		System.out.printf("   count\tsorted\treverse\trandom\tsame\t%10s\t%10s%n",
				sortRoutine.getExpectedComplexityClass().toString(),
				sortRoutine.getExpectedComplexityClass().toString());
		System.out.flush();

		double timeSorted = -1;
		double timeReverseSorted = -1;
		double timeRandom = -1;
		double timeAllSame = -1;

		// Store so we can change back at the end of the sorting.
		boolean doSorted = Constants.DO_SORTED;
		boolean doReverse = Constants.DO_REVERSE;
		boolean doRandom = Constants.DO_RANDOM;
		boolean doSame = Constants.DO_SAME;

		int startCount = 0;
		int countIncrement = 0;
		int maxCount = 0;

		// Determine how many elements to put in the array, how many elements to go up
		// for each iteration, and when to stop testing
		if (sortRoutine.getExpectedComplexityClass() == ComplexityClass.N_LOG_N) {
			startCount = Constants.N_LOG_N_STARTING;
			countIncrement = Constants.N_LOG_N_INTERVAL;
			maxCount = Constants.N_LOG_N_STOPPING;
		} else if (sortRoutine.getExpectedComplexityClass() == ComplexityClass.N_SQUARED) {
			startCount = Constants.N_SQUARE_STARTING;
			countIncrement = Constants.N_SQUARED_INTERVAL;
			maxCount = Constants.N_SQUARED_STOPPING;
		}

		for (int count = startCount; count <= maxCount; count += countIncrement) {

			Integer[] test = null;

			///////////////////////////////////////////////////
			// TEST All Same

			if (Constants.DO_SAME) {
				test = generateSameArray(count, count);
				timeAllSame = testAndTimeArray(sortRoutine, test, ArrayConfig.SAME);
			}

			///////////////////////////////////////////////////
			// TEST RANDOM

			if (Constants.DO_RANDOM) {
				test = generateRandomArray(count, maxCount);
				timeRandom = testAndTimeArray(sortRoutine, test, ArrayConfig.RANDOM);
			}

			/////////////////////////////////////////////////////////
			// TEST already SORTED

			if (Constants.DO_SORTED) {
				test = generateSortedArray(count);
				timeSorted = testAndTimeArray(sortRoutine, test, ArrayConfig.SORTED);
			}

			////////////////////////////////////////////////////////////////
			// TEST REVERSE SORTED

			if (Constants.DO_REVERSE) {
				test = generateReverseSortedArray(count);
				timeReverseSorted = testAndTimeArray(sortRoutine, test, ArrayConfig.REVERSE_SORTED);
			}

			//////////////////////////////////////////////////////////////////////
			// Print out timing information!

			System.out.printf("%8d\t%s\t%s\t%s\t%s\t", count,
					timeSorted < 0 ? "     " : String.format("%5.2f", timeSorted),
					timeReverseSorted < 0 ? "     " : String.format("%5.2f", timeReverseSorted),
					timeRandom < 0 ? "     " : String.format("%5.2f", timeRandom),
					timeAllSame < 0 ? "     " : String.format("%5.2f", timeAllSame));

			double timeWorst = Math.max(timeRandom, Math.max(timeSorted, Math.max(timeReverseSorted, timeAllSame)));

			// If (sort_routine.get_expected_complexity_class() IS N log N then divide time
			// by N Log N
			double logN2 = Math.log(count) / Math.log(2);
			if (sortRoutine.getExpectedComplexityClass() == ComplexityClass.N_LOG_N) {
				double timeRandomDividedByNLogN = timeRandom / (count * logN2) * 1_000_000;
				double timeWorstDividedByNLogN = timeWorst / (count * logN2) * 1_000_000;

				System.out.printf("%f\t%f%n", timeRandomDividedByNLogN, timeWorstDividedByNLogN);
			} else if (sortRoutine.getExpectedComplexityClass() == ComplexityClass.N_SQUARED) {
				double timeRandomDividedByNSquared = timeRandom / (count * count) * 1_000_000;
				double timeWorstDividedByNSqaured = timeWorst / (count * count) * 1_000_000;

				System.out.printf("%f\t%f%n", timeRandomDividedByNSquared, timeWorstDividedByNSqaured);
			}

			System.out.flush();
		}

		System.out.println();

		// After running all of the loops for this sort, return the values of the
		// properties file back to what it was.
		Constants.DO_SAME = doSame;
		Constants.DO_SORTED = doSorted;
		Constants.DO_REVERSE = doReverse;
		Constants.DO_RANDOM = doRandom;

	}

	public double testAndTimeArray(Sorter<Integer> sortRoutine, Integer[] test, ArrayConfig config) {
		try {
			timerOn();
			sortRoutine.sort(test);
			timerOff();
			double time = getTime();

			if (!isSorted(test, 0, test.length)) {
				System.out.println(Constants.NOT_SORTED_ERROR);
				return time;
			}

			// If the last iteration of the test took more time than this number, don't do
			// any more tests in this category. Note: the TIMEOUT_THRESHOLD_SECONDS probably
			// won't come into consideration until you start timing really big array sets
			if (time > Constants.TIMEOUT_THRESHOLD_SECONDS) {
				System.out.println(MessageFormat.format(Constants.TIMEOUT_ERROR, config));
				changeConfigBool(config, false);
				return -1;
			}
			return time;

		} catch (java.lang.OutOfMemoryError error) {
			System.out.println(MessageFormat.format(Constants.MEMORY_ERROR, config));
			changeConfigBool(config, false);
			return -1;
		} catch (java.lang.StackOverflowError error) {
			System.out.println(MessageFormat.format(Constants.STACKOVERFLOW_ERROR, config));
			changeConfigBool(config, false);
			return -1;
		}
	}

	/**
	 * Based on the type of Array, change the boolean. This is used as a boolean
	 * flag to determine if the sorting for this type of array should continue to be
	 * run for that sort.
	 * 
	 * @param config - The Array type to change the boolean value.
	 * @param bool   - Change the status of that Constant to this value.
	 */
	public static void changeConfigBool(ArrayConfig config, boolean bool) {
		switch (config) {
		case SAME:
			Constants.DO_SAME = bool;
			break;
		case RANDOM:
			Constants.DO_RANDOM = bool;
			break;
		case REVERSE_SORTED:
			Constants.DO_REVERSE = bool;
			break;
		case SORTED:
			Constants.DO_SORTED = bool;
			break;
		}
	}

	/**
	 * Test the sorting routines with RANDOM data but changing the "constant" for
	 * the sort every time. This is useful to see what the best GAP for shell sort
	 * is or the best Insertion Sort Cutoff for Merge Sort and Quick Sort is
	 *
	 * 
	 * @param sortRoutine - which routine to test for various "constant" changes
	 * @param startValue  - start value of "constant"
	 * @param increment   - increment value of "constant"
	 * @param endValue    - final value of "constant"
	 * @param itemsToSort - number of items to sort on
	 */
	public void timeConstantChange(Sorter<Integer> sortRoutine, double startValue, double increment, double endValue,
			int itemsToSort) {

		final int total = itemsToSort;

		System.out.printf("Sorting Using %s: (Cutoff, Time (Seconds), Constant(*10e6) (of %d elements)%n",
				sortRoutine.nameOfSort(), total);

		double timeRandom = 0;

		Integer[] sample = new Integer[itemsToSort];

		System.out.printf("Cutoff\tTotal Time\t Constant = time/NLogN%n");

		for (double cutoff = startValue; cutoff <= endValue; cutoff += increment) {
			// Slow things down so we can get other work (like debugging)
			// done
			/*
			 * try { Thread.sleep(10); } catch (InterruptedException exception) { // should
			 * never happen... exception.printStackTrace(); }
			 */
			///////////////////////////////////////////////////
			// TEST RANDOM
			//
			// Make X runs over random data and average time

			timeRandom = 0;
			sortRoutine.setConstant(cutoff);
			int runs = 10;

			for (int run = 0; run < runs; run++) {

				sample = generateRandomArray(total, total);

				timerOn();
				sortRoutine.sort(sample);
				timerOff();

				if (!isSorted(sample, 0, sample.length)) {
					System.out.printf("Error encountered Sorting an array of random numbers. Array not sorted!%n");
					timeRandom = -1;
					return;
				}

				timeRandom += getTime();
			}

			timeRandom /= runs;

			System.out.printf("%8d\t%9.4f\t%10.4f%n", (int) cutoff, timeRandom,
					1000000.0 * timeRandom / (total * (Math.log(total) / Math.log(Math.E))));

			System.out.flush();
		}
	}

	/**
	 * Start the timer
	 */
	private void timerOn() {
		startTime = System.nanoTime();
	}

	/**
	 * Turn off the timer
	 */
	private void timerOff() {
		endTime = System.nanoTime();
	}

	/**
	 * Get the time in seconds between on and off.
	 */
	private double getTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

}
