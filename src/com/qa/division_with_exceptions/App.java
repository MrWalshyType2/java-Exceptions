package com.qa.division_with_exceptions;

public class App {
	public static void main(String[] args) {
//		Logger log = Logger.getGlobal();
//
//		log.setLevel(Level.INFO);
//		log.info("BIRD");
//		log.warning("BIRD ESCAPED");

		System.out.println("10 / 0 = " + Math.divideHandler(10, 0));
		System.out.println("10 / 230 = " + Math.divideHandler(10, 230));
		System.out.println("10 / 5 = " + Math.divideHandler(10, 5));
	}
}
