package com.qa.division_with_exceptions;

public class Math {
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
			System.out.println(ble.toString());
			ble.printStackTrace();
		} catch (DivideByZeroException dbze) {
			System.out.println(dbze.toString());
			dbze.printStackTrace();
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			ae.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.toString());
			nfe.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return 0;
	}
}
