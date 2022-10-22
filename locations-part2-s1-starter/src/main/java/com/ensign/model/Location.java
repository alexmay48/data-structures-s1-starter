package com.ensign.model;

import java.awt.Graphics;

import javax.swing.JComponent;

/**
 * The Location class keeps x and y position on the map, as well contains the
 * methods necessary to calculate the distance between two distances and the
 * time to travel.
 * 
 * @author Alex May
 *
 */
public abstract class Location extends JComponent {

	/**
	 * This is needed to keep the compiler happy from warnings, but we will not be
	 * using serialization of the Location object.
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private double xPosition;
	private double yPosition;

	public Location(String id, double x, double y) {
		this.id = id;
		this.xPosition = x;
		this.yPosition = y;

		// GUI Code
		this.setLocation((int) xPosition, (int) yPosition);
		this.setSize(5, 5);
		this.setToolTipText(id);
	}
	
	/**
	 * Finds the distance to travel between this location and another.
	 * <p>
	 * We must first decide if we want this method to be abstract or not. To be
	 * abstract means that the children classes of Location MUST implement the
	 * method. (A child class can always override a non-static public or protected
	 * parent method)
	 * <p>
	 * THINK: Should the behavior differ between the children classes, or remain the
	 * same?
	 * <p>
	 * If you believe that this should remain abstract, then keep the method
	 * signature as is, and this will force you to write the code for it in the
	 * children classes. If you believe that the children classes do not have
	 * different behavior, and should have the same code, do the following:
	 * <ul>
	 * <li>Remove the 'abstract' key word at the beginning of the method line.
	 * <li>Remove the semicolon ';' at the end.
	 * <li>Add curly brackets '{ }' at the end to start writing the code within for
	 * the method
	 * </ul>
	 * <p>
	 * NOTE: You may be wondering what unit of measurement we are using. This is not
	 * too important for this application, but we will think in terms of Miles (MI).
	 * If it's easier for you, then simply think of it in Kilometers (KM).
	 * 
	 * @param loc - The other Location to find the distance between them.
	 * @return The distance to travel between this and the other location.
	 */
	abstract public double distanceBetweenLocation(Location loc);
	// FIXME: If it is not abstract method, place your Part 01 code here
	// (If it is an abstract method, remove the fixme)

	/**
	 * Finds the time to travel between this location and another.
	 * <p>
	 * We must first decide if we want this method to be abstract or not. To be
	 * abstract means that the children classes of Location MUST implement the
	 * method. (A child class can always override a non-static public or protected
	 * parent method)
	 * <p>
	 * THINK: Should the behavior differ between the children classes, or remain the
	 * same?
	 * <p>
	 * If you believe that this should remain abstract, then keep the method
	 * signature as is, and this will force you to write the code for it in the
	 * children classes. If you believe that the children classes do not have
	 * different behavior, and should have the same code, do the following:
	 * <ul>
	 * <li>Remove the 'abstract' key word at the beginning of the method line.
	 * <li>Remove the semicolon ';' at the end.
	 * <li>Add curly brackets '{ }' at the end to start writing the code within for
	 * the method
	 * </ul>
	 * <p>
	 * For travel time, You can travel between a ParkingSpot and a TrainStation or a
	 * ParkingSpot and an Airport. However, you cannot travel between an Airport and
	 * a TrainStation.
	 * <p>
	 * NOTE: You may be wondering what unit of measurement we are using. This is not
	 * too important for this application, but we will think in terms of Miles Per
	 * Hour (MPH). If it's easier for you, then simply think of it in Kilometers Per
	 * Hour (KPH).
	 * 
	 * @param loc - The other Location to find the travel time between them.
	 * @return The time to travel between this and the other location.
	 */
	abstract public double travelTimeToLocation(Location loc);
	// FIXME: If it is not abstract method, place your Part 01 code here
	// (If it is an abstract method, remove the fixme)

	/*
	 * "equals" method used for testing.
	 */

	@Override
	public boolean equals(Object o) {

		if (o == this) {
			return true;
		}

		if (!(o instanceof Location)) {
			return false;
		}

		Location loc = (Location) o;

		return id.equals(loc.id) && xPosition == loc.xPosition && yPosition == loc.yPosition;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", x=" + xPosition + ", y=" + yPosition + "]";
	}

	/*
	 * Getters and Setters
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getXPosition() {
		return xPosition;
	}

	public void setXPosition(double xPosition) {
		this.xPosition = xPosition;
	}

	public double getYPosition() {
		return yPosition;
	}

	public void setYPosition(double yPosition) {
		this.yPosition = yPosition;
	}

}
