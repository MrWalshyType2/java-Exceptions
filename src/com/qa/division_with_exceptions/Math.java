package com.qa.division_with_exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Math {

	private static final Logger LOG = Logger.getGlobal();

	private static void logMessage(String message) {
		LOG.setLevel(Level.INFO);
		LOG.info(message);
		LOG.setLevel(Level.ALL);
	}

	private static int divide(int num1, int num2) throws DivideByZeroException, BLargerException {
		if (num2 == 0) {
			throw new DivideByZeroException("Cannot divide by 0.");
		} else if (num1 < num2) {
			throw new BLargerException("Num2 is bigger then Num1.");
		}
		return num1 / num2;
	}

	public static int divideHandler(int num1, int num2) {
		try {
			return divide(num1, num2);
		} catch (BLargerException ble) {
			logMessage(ble.toString());
			ble.printStackTrace();
		} catch (DivideByZeroException dbze) {
			logMessage(dbze.toString());
			dbze.printStackTrace();
		} catch (ArithmeticException ae) {
			logMessage(ae.toString());
			ae.printStackTrace();
		} catch (NumberFormatException nfe) {
			logMessage(nfe.toString());
			nfe.printStackTrace();
		} catch (Exception e) {
			logMessage(e.toString());
			e.printStackTrace();
		}
		return 0;
	}
}
