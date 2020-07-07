package com.qa.division_with_exceptions;

public class DivideByZeroException extends ArithmeticException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DivideByZeroException() {

	}

	public DivideByZeroException(String errorMsg) {
		super(errorMsg);
	}
}
