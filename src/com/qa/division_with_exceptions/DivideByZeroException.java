package com.qa.division_with_exceptions;

public class DivideByZeroException extends ArithmeticException {
	public DivideByZeroException() {

	}

	public DivideByZeroException(String errorMsg) {
		super(errorMsg);
	}
}
