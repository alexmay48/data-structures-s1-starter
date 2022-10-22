package com.ensign;

import java.io.InputStream;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

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

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createMap();
			}
		});

	}

	/**
	 * Create and set up the Map and it's GUI in order to run the algorithms.
	 */
	private static void createMap() {
		int min = Integer.parseInt(MapMain.prop.getProperty("locations_min"));

		JFrame window = new JFrame("Star Field");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 100, 1000, 1000);
		window.setLayout(null);

		Map map = new Map(1000, 1000, 940, 940);
		map.setVisible(true);
		map.createLocations(min);
		map.addLocationsToGui();

		window.setTitle("Map");
		window.setContentPane(map);
		window.setJMenuBar(map.createUpMenuBar());
		window.setVisible(true);
	}

}
