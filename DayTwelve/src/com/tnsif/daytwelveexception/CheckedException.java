package com.tnsif.daytwelveexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader class read only text input 

public class CheckedException {
	static String acceptText() throws IOException , ArithmeticException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string ...");

		String str=br.readLine();
		return str;
	}

	public static void main(String[] args) {
		
		try {
			String str1=acceptText();
			System.out.println("Your string is "+str1);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
