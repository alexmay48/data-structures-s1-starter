package com.learn.sort.utils;

/**
 * An ENUM to help determine the type of arrays we are working with as well as a
 * toString
 */
public enum ArrayConfig {

	SAME, SORTED, REVERSE_SORTED, RANDOM;

	public String toString() {
		switch (this) {
		case RANDOM:
			return "Random";
		case REVERSE_SORTED:
			return "Reverse Sorted";
		case SAME:
			return "Same";
		case SORTED:
			return "Sorted";
		}
		return null;
	}

}
