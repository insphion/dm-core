package com.insphion.dm.framework;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  A wrapper class to plug in rules for logging
 */
public class DecisionManagementLogger {
	private static Logger LOGGER;

	static {
		LOGGER = Logger.getLogger(DecisionManagementLogger.class.getName());
	}
	
	public static final void debug(String msg) {
		LOGGER.log(Level.FINEST, msg);
	}
	
	public static final void warn(String msg) {
		LOGGER.log(Level.WARNING, msg);
	}
	
	public static final void error(String msg) {
		LOGGER.log(Level.SEVERE, msg);
	}
	
	public static final void info(String msg) {
		LOGGER.log(Level.INFO, msg);
	}
	
	public static final void infoConfig(String msg) {
		LOGGER.log(Level.CONFIG, msg);
	}
}
