package com.lorenzocalza.test;

import com.lorenzocalza.logger.Logger;

public class TestLogger {

	public static void main(String[] args) {
		Logger logInfo = new Logger(Logger.Mode.INFO);
		logInfo.log("This is a simple output under the INFO flag.");

		logInfo.setDate(true);
		logInfo.log("This is a simple output under the INFO flag.");

		logInfo.setDate(false);
		logInfo.setTime(true);
		logInfo.log("This is a simple output under the INFO flag.");

		logInfo.setDate(true);
		logInfo.log("This is a simple output under the INFO flag.");

		logInfo.setName("My Application");
		logInfo.log("This is a simple output under the INFO flag.");

		Logger logErr = new Logger(Logger.Mode.ERROR, true, true, "Test");
		logErr.log("ERROR!");

	}
}
