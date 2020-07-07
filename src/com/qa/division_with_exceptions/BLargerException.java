package com.qa.division_with_exceptions;

public class BLargerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BLargerException() {

	}

	public BLargerException(String errorMsg) {
		super(errorMsg);
	}

	public BLargerException(String errorMsg, Throwable err) {
		super(errorMsg, err);
	}
}
