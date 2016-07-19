package io.github.rotemdev.api;

/**
 * @author RotemDev
 *
 */
public class API {
	public static final String API_NAME = "RotemDev API";
	public static final int CHRONO_VERSION = 1;
	public static final String SERIAL_VESION = "1.0.0";
	public static final int STAGE = Stage.ALPHA;
	public static final String[] PACKAGES = {"ANIMAL", "RANDOM"};
	
	public static String getAPIName() {
		return API_NAME;
	}
	public static int getChronoVersion() {
		return CHRONO_VERSION;
	}
	public static String getSerialVesion() {
		return SERIAL_VESION;
	}
	public static int getStage() {
		return STAGE;
	}
	public static String[] getPackages() {
		return PACKAGES;
	}
}
