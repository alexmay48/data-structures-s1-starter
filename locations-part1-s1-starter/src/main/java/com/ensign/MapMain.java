package com.ensign;

import java.io.InputStream;
import java.util.Properties;

/**
 * This application is an example of an algorithm to find the longest and
 * quickest paths between locations. The purpose of the application is
 * educational and to help review Java concepts while also helping the students
 * to ponder complexity and how it can affect performance.
 * <p>
 * This version has a GUI attached to help give a visual to the students.
 * 
 * @author Alex May
 *
 */
public class MapMain {

	/**
	 * We make the properties 'public' and 'static' so that it can be accessed from
	 * anywhere in the application. This is a global variable which is typically not
	 * best practice, but is useful and acceptable in some cases. The properties
	 * should be immediately loaded when main is called so it is the first action
	 * done in the application.
	 */
	public static Properties prop = new Properties();

	public static void main(String[] args) {

		try (InputStream input = MapMain.class.getClassLoader().getResourceAsStream("application.properties")) {
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		createMap();

	}

	/**
	 * Create and set up the Map in order to run the algorithms.
	 */
	private static void createMap() {
		int min = Integer.parseInt(MapMain.prop.getProperty("locations_min"));
		int max = Integer.parseInt(MapMain.prop.getProperty("locations_max"));

		System.out.printf("%-12s%-12s%-12s%-12s%-12s%-12s%-12s%n", "Time", "Count", "Location 1", "Location 2",
				"Distance", "Travel-Time", "Query Type");
		Map map1 = new Map(1000, 1000, 940, 940);
		map1.createLocations(min);
		map1.findLongestPath();
		map1.findQuickestPath();

		Map map2 = new Map(1000, 1000, 940, 940);
		map2.createLocations(max);
		map2.findLongestPath();
		map2.findQuickestPath();
	}

}
