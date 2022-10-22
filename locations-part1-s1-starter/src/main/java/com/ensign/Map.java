package com.ensign;

import java.util.ArrayList;
import java.util.Random;

import com.ensign.model.Location;

public class Map {

	private int maxDistanceX;
	private int maxDistanceY;
	ArrayList<Location> locations;
	ArrayList<Location> quickestLocations;
	ArrayList<Location> longestLocations;

	/**
	 * Constructor for the map.
	 * 
	 * @param width        - The width of the screen (Will not be used in part1)
	 * @param height       - The height of the screen (Will not be used in part1)
	 * @param maxDistanceX - The max x distance that a location can be on the map
	 * @param maxDistanceY - The max y distance that a location can be on the map
	 */
	public Map(int width, int height, int maxDistanceX, int maxDistanceY) {

	}

	/**
	 * The algorithm to find the longest path between an array of Locations on the
	 * Map.
	 * <p>
	 * You need compare the distance of every path to each other to find the longest
	 * path. This means that you need to look at every point, and then compare the
	 * point to every other point to make sure that you find the longest path. There
	 * may be a nested loop...
	 * <p>
	 * NOTE: This is very similar to the algorithm to "findQuickestPath", and could
	 * be easily changed to a "findShortestPath" algorithm as well.
	 * 
	 * @param locations - The locations on the map
	 * @return an ArrayList of size two. It should only contain the two locations
	 *         that have the longest path between them.
	 */
	public static ArrayList<Location> findLongestPath(ArrayList<Location> locations) {
		// FIXME:
		return null;
	}

	/**
	 * The algorithm to find the quickest path of travel between an array of
	 * Locations on the Map.
	 * <p>
	 * You need compare the distance of every path to each other to find the
	 * quickest path. This means that you need to look at every point, and then
	 * compare the point to every other point to make sure that you find the
	 * quickest path. There may be a nested loop...
	 * <p>
	 * NOTE: This is very similar to the algorithm to "findLongestPath", and could
	 * be easily changed to a "findShortestPath" algorithm as well.
	 * 
	 * @param locations - The locations on the map
	 * @return an ArrayList of size two. It should only contain the two locations
	 *         that have the quickest path between them.
	 */
	public static ArrayList<Location> findQuickestPath(ArrayList<Location> locations) {
		// FIXME:
		return null;
	}

	/**
	 * Create the locations at random positions across the map. We can use a random
	 * number generator to create a more or less equal amount of the type of
	 * locations.
	 * 
	 * @param numOfLocations - Number of locations to create.
	 */
	public void createLocations(int numOfLocations) {
		// FIXME: Create the locations to be placed onto the map.

		// TODO: Create the "Airport" object that extends Location

		// TODO: Create the "TrainStation" object that extends Location

		// TODO: Create the "ParkingSpot" object that extends Location
	}

	/**
	 * This getter is used for testing purposes.
	 * 
	 * @return The locations on the map.
	 */
	public ArrayList<Location> getLocations() {
		return locations;
	}

	/*
	 * ******************************** TIMING CODE ********************************
	 * You should not need to alter these methods unless you want to add more
	 * effects for extra credit.
	 * 
	 * You can write your own methods before or after these, but not in the middle.
	 */

	public void findQuickestPath() {
		long startTime = System.nanoTime();

		quickestLocations = findQuickestPath(locations);

		long endTime = System.nanoTime();
		long time = endTime - startTime;

		Location loc1 = quickestLocations.get(0);
		Location loc2 = quickestLocations.get(1);

		double travelTime = loc1.travelTimeToLocation(loc2);
		double distance = loc1.distanceBetweenLocation(loc2);
		System.out.printf("%12.5f%12s%12s%12s%12.6f%12.5f%12s%n", (time / 1.0e9), locations.size(), loc1.getId(),
				loc2.getId(), distance, travelTime, "QUICKEST");

	}

	public void findLongestPath() {
		long startTime = System.nanoTime();

		longestLocations = findLongestPath(locations);

		long endTime = System.nanoTime();
		long time = endTime - startTime;

		Location loc1 = longestLocations.get(0);
		Location loc2 = longestLocations.get(1);

		double travelTime = loc1.travelTimeToLocation(loc2);
		double distance = loc1.distanceBetweenLocation(loc2);
		if (travelTime == Double.MAX_VALUE) {
			System.out.printf("%12.5f%12s%12s%12s%12.6f%12s%12s%n", (time / 1.0e9), locations.size(), loc1.getId(),
					loc2.getId(), distance, "N/A", "LONGEST");
		} else {
			System.out.printf("%12.5f%12s%12s%12s%12.6f%12.5f%12s%n", (time / 1.0e9), locations.size(), loc1.getId(),
					loc2.getId(), distance, travelTime, "LONGEST");
		}

	}

	/*
	 * ****************************** END TIMING CODE ******************************
	 * You can write your own methods before or after these, but not in the middle.
	 */

}
