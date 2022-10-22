package com.ensign.model;

import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ensign.Map;
import com.ensign.MapMain;

@TestInstance(Lifecycle.PER_CLASS)
public class MapTest {

	ArrayList<Location> locations1;

	/*
	 * The "BeforeAll" is so that this only executes once. This means that all tests
	 * will share the "locations1" ArrayList. Note that for it to work using JUnit
	 * 5, we must have the "@TestInstance(Lifecycle.PER_CLASS)" annotation above the
	 * test class.
	 */

	@BeforeAll
	public void testSetUp() {

		try (InputStream input = MapMain.class.getClassLoader().getResourceAsStream("application-test.properties")) {
			MapMain.prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}

		locations1 = new ArrayList<>();

		locations1.add(new ParkingSpot("ps1", 300, 300));
		locations1.add(new ParkingSpot("ps2", 400, 400));

		locations1.add(new TrainStation("ts1", 600, 600));
		locations1.add(new TrainStation("ts2", 700, 700));

		locations1.add(new Airport("ap1", 800, 300));
		locations1.add(new Airport("ap2", 400, 500));

	}

	@Test
	public void testLongestPath() {
		ArrayList<Location> testLocations = new ArrayList<>();
		testLocations.add(new ParkingSpot("ps1", 300, 300));
		testLocations.add(new TrainStation("ts2", 700, 700));
		assertEquals(testLocations, Map.findLongestPath(locations1));
	}

	@Test
	public void testQuickestPath() {
		ArrayList<Location> testLocations = new ArrayList<>();
		testLocations.add(new Airport("ap1", 800, 300));
		testLocations.add(new Airport("ap2", 400, 500));
		assertEquals(testLocations, Map.findQuickestPath(locations1));
	}

	@Test
	public void testCreateLocations() {
		Map map = new Map(1000, 1000, 940, 940);
		map.createLocations(30);
		assertEquals(30, map.getLocations().size());
	}

	/*
	 * Other
	 */

	@Test
	public void testLoadedProperties() {
		assertEquals(80.0, Double.parseDouble(MapMain.prop.getProperty("car_speed")));
		assertEquals(120.0, Double.parseDouble(MapMain.prop.getProperty("train_speed")));
		assertEquals(500.0, Double.parseDouble(MapMain.prop.getProperty("airplane_speed")));
	}

}
