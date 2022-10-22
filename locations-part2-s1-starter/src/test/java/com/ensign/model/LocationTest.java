package com.ensign.model;

import java.io.InputStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.ensign.MapMain;

@TestInstance(Lifecycle.PER_CLASS)
public class LocationTest {

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

	/*
	 * distanceBetweenLocation
	 */

	@Test
	public void testDistanceParkingSpotToParkingSpot() {
		assertEquals(141.42, locations1.get(0).distanceBetweenLocation(locations1.get(1)), 0.01);
	}

	@Test
	public void testDistanceParkingSpotToTrainStation() {
		assertEquals(424.26, locations1.get(0).distanceBetweenLocation(locations1.get(2)), 0.01);
	}

	@Test
	public void testDistanceParkingSpotToAirport() {
		assertEquals(500.0, locations1.get(0).distanceBetweenLocation(locations1.get(4)));
	}

	@Test
	public void testDistanceTrainStationToTrainStation() {
		assertEquals(141.42, locations1.get(2).distanceBetweenLocation(locations1.get(3)), 0.01);
	}

	@Test
	public void testDistanceTrainStationParkingSport() {
		assertEquals(424.26, locations1.get(2).distanceBetweenLocation(locations1.get(0)), 0.01);
	}

	@Test
	public void testDistanceTrainStationToAirport() {
		assertEquals(360.55, locations1.get(2).distanceBetweenLocation(locations1.get(4)), 0.01);
	}

	@Test
	public void testDistanceAirportToAirport() {
		assertEquals(447.21, locations1.get(4).distanceBetweenLocation(locations1.get(5)), 0.01);
	}

	@Test
	public void testDistanceAirportToParkingSpot() {
		assertEquals(500.0, locations1.get(4).distanceBetweenLocation(locations1.get(0)));
	}

	@Test
	public void testDistanceAirportToTrainStation() {
		assertEquals(360.55, locations1.get(4).distanceBetweenLocation(locations1.get(2)), 0.01);
	}

	/*
	 * travelTimeToLocation
	 */

	@Test
	public void testTimeParkingSpotToParkingSpot() {
		assertEquals(1.767, locations1.get(0).travelTimeToLocation(locations1.get(1)), 0.01);
	}

	@Test
	public void testTimeParkingSpotToTrainStation() {
		assertEquals(5.30, locations1.get(0).travelTimeToLocation(locations1.get(2)), 0.01);
	}

	@Test
	public void testTimeParkingSpotToAirport() {
		assertEquals(6.25, locations1.get(0).travelTimeToLocation(locations1.get(4)), 0.01);
	}

	@Test
	public void testTimeTrainStationToTrainStation() {
		assertEquals(1.17, locations1.get(2).travelTimeToLocation(locations1.get(3)), 0.01);
	}

	@Test
	public void testTimeTrainStationParkingSport() {
		assertEquals(5.30, locations1.get(2).travelTimeToLocation(locations1.get(0)), 0.01);
	}

	@Test
	public void testTimeTrainStationToAirport() {
		assertEquals(Double.MAX_VALUE, locations1.get(2).travelTimeToLocation(locations1.get(4)));
	}

	@Test
	public void testTimeAirportToAirport() {
		assertEquals(0.89, locations1.get(4).travelTimeToLocation(locations1.get(5)), 0.01);
	}

	@Test
	public void testTimeAirportToParkingSpot() {
		assertEquals(6.25, locations1.get(4).travelTimeToLocation(locations1.get(0)), 0.1);
	}

	@Test
	public void testTimeAirportToTrainStation() {
		assertEquals(Double.MAX_VALUE, locations1.get(4).travelTimeToLocation(locations1.get(2)));
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
