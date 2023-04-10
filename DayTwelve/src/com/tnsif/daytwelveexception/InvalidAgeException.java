package com.tnsif.daytwelveexception;

public class InvalidAgeException extends Exception{

	public InvalidAgeException(String str)
	{
		super(str);
		
	}
	public InvalidAgeException()
	{
		super("invalid age");
		
	}
	
}
