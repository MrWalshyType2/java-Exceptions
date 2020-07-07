package com.qa.division_with_exceptions;

public class Math {
	public static int divide(int num1, int num2) {
		try {

			if (num2 == 0) {
				throw new DivideByZeroException("Cannot divide by 0.");
			} else if (num1 < num2) {
				throw new BLargerException("Num2 is bigger then Num1.");
			}
			return num1 / num2;

		} catch (DivideByZeroException dbze) {
			System.out.println(dbze.toString());
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.toString());
		} catch (BLargerException ble) {
			System.out.println(ble.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return 0;
	}
}
