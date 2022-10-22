package com.ensign;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.ensign.model.Airport;
import com.ensign.model.Location;
import com.ensign.model.ParkingSpot;
import com.ensign.model.TrainStation;

/**
 * The Map contains all of the locations and the algorithm to find the longest
 * and quickest paths between all of the locations.
 * 
 * @author Alex May
 *
 */
public class Map extends JPanel {

	private int maxDistanceX = 980;
	private int maxDistanceY = 940;
	ArrayList<Location> locations;
	ArrayList<Location> quickestLocations;
	ArrayList<Location> longestLocations;

	/*
	 * GUI Fields
	 */
	private static final long serialVersionUID = 1L;
	JMenu findPathMenu;
	JMenuItem findQuickestPathMenuItem;
	JMenuItem findLongestPathMenuItem;
	JMenuItem timeQuickestPathMenuItem;
	JMenuItem timeLongestPathMenuItem;

	/**
	 * Constructor for the map.
	 * 
	 * @param width        - The width of the screen
	 * @param height       - The height of the screen
	 * @param maxDistanceX - The max x distance that a location can be on the map
	 * @param maxDistanceY - The max y distance that a location can be on the map
	 */
	public Map(int width, int height, int maxDistanceX, int maxDistanceY) {

		this.maxDistanceX = maxDistanceX;
		this.maxDistanceY = maxDistanceY;

		quickestLocations = new ArrayList<>();
		longestLocations = new ArrayList<>();
		locations = new ArrayList<>();

		this.setSize(width, height);
		this.setLocation(0, 0);
		this.setLayout(null);
		this.setFocusable(true);
		this.grabFocus();
		this.setBackground(Color.BLACK);
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

		// FIXME: Replace your code from Part 01 here.
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

		// FIXME: Replace your code from Part 01 here.
		return null;
	}

	/**
	 * Create the locations at random positions across the map. We use a random
	 * number generator to create a more or less equal amount of the type of
	 * locations.
	 * 
	 * @param numOfLocations - Number of locations to create.
	 */
	public void createLocations(int numOfLocations) {
		// Create random parking spots
		// FIXME: Replace your code from Part 01 here.
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
	 * ********************************* GUI CODE *********************************
	 * You should not need to alter these methods unless you want to add more
	 * effects for extra credit.
	 * 
	 * You can write your own methods before or after these, but not in the middle.
	 */

	/**
	 * This will perform the timing and GUI operations surrounding the actual
	 * algorithm.
	 */
	public void findQuickestPath() {
		findQuickestPathMenuItem.setText("Solving Quickest Path... ");
		findPathMenu.setText("Solving Quickest Path... ");
		findPathMenu.setEnabled(false);
		this.repaint();
		long startTime = System.nanoTime();

		quickestLocations = findQuickestPath(locations);

		long endTime = System.nanoTime();
		long time = endTime - startTime;

		findQuickestPathMenuItem.setText("Quickest Path Solved! Seconds to calculate: " + (time / 1.0e9)
				+ " . With location number: " + locations.size());
		findPathMenu.setText("Find Path");
		findPathMenu.setEnabled(true);

		this.repaint();

	}

	/**
	 * This will perform the timing and GUI operations surrounding the actual
	 * algorithm.
	 */
	public void findLongestPath() {
		findLongestPathMenuItem.setText("Solving Longest Path... ");
		findPathMenu.setText("Solving Longest Path... ");
		findPathMenu.setEnabled(false);
		this.repaint();
		long startTime = System.nanoTime();

		longestLocations = findLongestPath(locations);

		long endTime = System.nanoTime();
		long time = endTime - startTime;

		findLongestPathMenuItem.setText("Longest Path Solved! Seconds to calculate: " + (time / 1.0e9)
				+ " . With location number: " + locations.size());
		findPathMenu.setText("Find Path");
		findPathMenu.setEnabled(true);

		this.repaint();

	}

	/**
	 * After creating the locations in memory, they are not in the GUI to be
	 * displayed. This will add them to the Map GUI
	 */
	public void addLocationsToGui() {
		for (Location loc : locations) {
			this.add(loc);
		}
	}

	/**
	 * When changing the number of Locations we want to look at, we might have
	 * cleared the 'locations' ArrayList, but we need to remove them from the GUI,
	 * or else they would persist when adding more locations to the GUI.
	 */
	public void removeLocationsFromGui() {
		Component[] comps = this.getComponents();
		for (Component comp : comps) {
			if (comp instanceof Location) {
				this.remove(comp);
			}
		}
	}

	/**
	 * This sets up the menu bar for use. It also adds the actions to take upon
	 * clicking on the menu bars.
	 * 
	 * @return The menu bar for the Map
	 */
	public JMenuBar createUpMenuBar() {

		JMenuBar menuBar = new JMenuBar();
		findPathMenu = new JMenu("Find Path");
		JMenu locationsMenu = new JMenu("Locations");

		findQuickestPathMenuItem = new JMenuItem("Find Quickest Path");
		findQuickestPathMenuItem.addActionListener((ActionEvent e) -> {
			findQuickestPath();
		});

		findLongestPathMenuItem = new JMenuItem("Find Longest Path");
		findLongestPathMenuItem.addActionListener((ActionEvent e) -> {
			findLongestPath();
		});

		findPathMenu.add(findQuickestPathMenuItem);
		findPathMenu.add(findLongestPathMenuItem);

		// Where is the data from these properties coming from?
		int min = Integer.parseInt(MapMain.prop.getProperty("locations_min"));
		int max = Integer.parseInt(MapMain.prop.getProperty("locations_max"));
		int increment = Integer.parseInt(MapMain.prop.getProperty("locations_increment"));

		for (int i = min; i <= max; i += increment) {
			JMenuItem locations = new JMenuItem("" + i);
			locations.setActionCommand(i + "");
			locations.addActionListener((ActionEvent e) -> {
				findQuickestPathMenuItem.setText("Find Quickest Path");
				findLongestPathMenuItem.setText("Find Longest Path");
				this.quickestLocations.clear();
				this.longestLocations.clear();
				this.locations.clear();
				createLocations(Integer.parseInt(e.getActionCommand()));
				removeLocationsFromGui();
				addLocationsToGui();
				this.repaint();
			});
			locationsMenu.add(locations);
		}

		menuBar.add(findPathMenu);
		menuBar.add(locationsMenu);

		return menuBar;

	}

	/**
	 * Besides just drawing the Location components on the panel, we need to change
	 * the Location components that highlight the paths found.
	 */
	@Override
	public void paintComponent(Graphics g) {
		// Needed to paint the Map correctly
		super.paintComponent(g);

		if (quickestLocations.size() == 2) {
			Location loc1 = quickestLocations.get(0);
			Location loc2 = quickestLocations.get(1);
			loc1.setSize(10, 10);
			loc2.setSize(10, 10);
			loc1.setForeground(Color.GREEN);
			loc2.setForeground(Color.GREEN);
			g.setColor(Color.GREEN);
			g.drawLine(loc1.getX() + (loc1.getWidth() / 2), loc1.getY() + (loc1.getWidth() / 2),
					loc2.getX() + (loc2.getWidth() / 2), loc2.getY() + (loc2.getWidth() / 2));
		}
		if (longestLocations.size() == 2) {
			Location loc1 = longestLocations.get(0);
			Location loc2 = longestLocations.get(1);
			loc1.setSize(10, 10);
			loc2.setSize(10, 10);
			loc1.setForeground(Color.RED);
			loc2.setForeground(Color.RED);
			g.setColor(Color.RED);
			g.drawLine(loc1.getX() + (loc1.getWidth() / 2), loc1.getY() + (loc1.getWidth() / 2),
					loc2.getX() + (loc2.getWidth() / 2), loc2.getY() + (loc2.getWidth() / 2));
		}

	}

	/*
	 * ******************************* END GUI CODE *******************************
	 * You can write your own methods before or after these, but not in the middle.
	 */

}
