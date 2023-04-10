package com.tnsif.exceptionhandling;

public class NestedTryCatch {

	public static void check() {
		String str = "TNSIF";
		int slength = str.length();

		System.out.println("String length is " + slength);

		String OneString = null;

		int y = 4;

		try {
			// inner try block

			try {
				System.out.println(str.charAt(y));
			} catch (StringIndexOutOfBoundsException e) {

				System.err.println("index is out of range " + e.getMessage());

			}

			System.out.println("length of second string 2" + OneString.length());

		} catch (NullPointerException npe) {
			System.err.println("error is occur due to this " + npe.getMessage());

		}

	}

}
