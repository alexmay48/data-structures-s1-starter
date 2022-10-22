package com.learn.sort.sorters;

/**
 * This ENUM allows us to "tag" sorts with an expected performance and perhaps
 * compute different statistics based on this.
 * 
 * @author germain - edited by Alex May
 *
 */
public enum ComplexityClass {

	N_LOG_N, N_SQUARED;

	/**
	 * Returns the value of this complexity as a formatted string.
	 */
	public String toString() {
		if (this == N_LOG_N)
			return "N log N";
		if (this == N_SQUARED)
			return "N squared";
		return "No complexity selected";
	}
}
