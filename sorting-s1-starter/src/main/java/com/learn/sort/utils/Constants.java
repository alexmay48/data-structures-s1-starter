package com.learn.sort.utils;

import java.io.IOException;
import java.util.Properties;

import com.learn.sort.SortingMain;

public class Constants {

	public static Properties prop;
	public static boolean INSERTION;
	public static boolean SHELL;
	public static boolean JAVA;
	public static boolean MERGE;
	public static boolean QUICK_FIRST_PIVOT;
	public static boolean QUICK_RANDOM_PIVOT;
	public static boolean QUICK_MEDIAN_THREE_PIVOT;

	public static boolean RUN_MERGE_CUTOFF;
	public static boolean RUN_QUICK_CUTOFF;

	public static int TIMEOUT_THRESHOLD_SECONDS;

	public static boolean DO_SAME;
	public static boolean DO_REVERSE;
	public static boolean DO_RANDOM;
	public static boolean DO_SORTED;

	public static int N_LOG_N_STARTING;
	public static int N_LOG_N_INTERVAL;
	public static int N_LOG_N_STOPPING;

	public static int N_SQUARE_STARTING;
	public static int N_SQUARED_INTERVAL;
	public static int N_SQUARED_STOPPING;

	public static String NOT_SORTED_ERROR;
	public static String TIMEOUT_ERROR;
	public static String MEMORY_ERROR;
	public static String STACKOVERFLOW_ERROR;

	/**
	 * This will load the properties from the application.properties file into the
	 * the constants.
	 */
	public static void loadProperties() {

		prop = new Properties();
		try {
			prop.load(SortingMain.class.getResourceAsStream("/application.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		INSERTION = Boolean.parseBoolean(prop.getProperty("INSERTION"));
		SHELL = Boolean.parseBoolean(prop.getProperty("SHELL"));
		JAVA = Boolean.parseBoolean(prop.getProperty("JAVA"));
		MERGE = Boolean.parseBoolean(prop.getProperty("MERGE"));
		QUICK_FIRST_PIVOT = Boolean.parseBoolean(prop.getProperty("QUICK_FIRST_PIVOT"));
		QUICK_RANDOM_PIVOT = Boolean.parseBoolean(prop.getProperty("QUICK_RANDOM_PIVOT"));
		QUICK_MEDIAN_THREE_PIVOT = Boolean.parseBoolean(prop.getProperty("QUICK_MEDIAN_THREE_PIVOT"));

		RUN_MERGE_CUTOFF = Boolean.parseBoolean(prop.getProperty("RUN_MERGE_CUTOFF"));
		RUN_QUICK_CUTOFF = Boolean.parseBoolean(prop.getProperty("RUN_QUICK_CUTOFF"));

		DO_SAME = Boolean.parseBoolean(prop.getProperty("DO_SAME"));
		DO_REVERSE = Boolean.parseBoolean(prop.getProperty("DO_REVERSE"));
		DO_RANDOM = Boolean.parseBoolean(prop.getProperty("DO_RANDOM"));
		DO_SORTED = Boolean.parseBoolean(prop.getProperty("DO_SORTED"));

		TIMEOUT_THRESHOLD_SECONDS = Integer.parseInt(prop.getProperty("TIMEOUT_THRESHOLD_SECONDS"));

		N_LOG_N_STARTING = Integer.parseInt(prop.getProperty("N_LOG_N_STARTING"));
		N_LOG_N_INTERVAL = Integer.parseInt(prop.getProperty("N_LOG_N_INTERVAL"));
		N_LOG_N_STOPPING = Integer.parseInt(prop.getProperty("N_LOG_N_STOPPING"));

		N_SQUARE_STARTING = Integer.parseInt(prop.getProperty("N_SQUARE_STARTING"));
		N_SQUARED_INTERVAL = Integer.parseInt(prop.getProperty("N_SQUARED_INTERVAL"));
		N_SQUARED_STOPPING = Integer.parseInt(prop.getProperty("N_SQUARED_STOPPING"));

		NOT_SORTED_ERROR = prop.getProperty("NOT_SORTED_ERROR");
		TIMEOUT_ERROR = prop.getProperty("TIMEOUT_ERROR");
		MEMORY_ERROR = prop.getProperty("MEMORY_ERROR");
		STACKOVERFLOW_ERROR = prop.getProperty("STACKOVERFLOW_ERROR");

	}

}
