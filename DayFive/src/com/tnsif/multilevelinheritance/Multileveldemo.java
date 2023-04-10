package com.tnsif.multilevelinheritance;

public class Multileveldemo {

	public static void main(String[] args) {


		City c= new City();
		
		c.setArea(1223.6f);
		c.setCityName("mumbai");
		
		c.setLanguage("marathii");
		c.setStateName("mumbai");
		
		c.setCountryName("india");
		c.setCapital("delhi");
		System.out.println(c);
	}

}
