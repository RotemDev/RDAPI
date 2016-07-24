package io.github.rotemdev.api;

/**
 * This is the API reference class, which holds all API variables.
 * 
 * @author RotemDev
 *
 */
public class API {
	/** The API name */
	public static final String API_NAME = "RotemDev API";
	/** The chronologic version (1, 2, 3, 4, 5, etc...) */
	public static final int CHRONO_VERSION = 1;
	/** The serial version */
	public static final String SERIAL_VESION = "1.0.0";
	/** The stage (Alpha = 0) */
	public static final int STAGE = Stage.ALPHA;
	/** The packages inside the API */
	public static final String[] PACKAGES = { "ANIMAL", "RANDOM", "TESTER"};

	/**
	 * @return the API Name
	 */
	public static String getAPIName() {
		return API_NAME;
	}

	/**
	 * @return the chronologic version
	 */
	public static int getChronoVersion() {
		return CHRONO_VERSION;
	}

	/**
	 * @return the serial version
	 */
	public static String getSerialVesion() {
		return SERIAL_VESION;
	}

	/**
	 * @return the development stage
	 */
	public static int getStage() {
		return STAGE;
	}

	/**
	 * @return a string array with all of the API packages
	 */
	public static String[] getPackages() {
		return PACKAGES;
	}
}
