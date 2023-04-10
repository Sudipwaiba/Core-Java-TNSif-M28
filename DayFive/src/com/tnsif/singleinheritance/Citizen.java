package com.tnsif.singleinheritance;

public class Citizen {

	private String name;
	private String aadharNo;
	private String address;
	private int age;
	
	//default constructor
	public Citizen() {
		System.out.println("default con");
	}
	public Citizen(String name, String aadharNo, String address, int age) {
		
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.age = age;
	}
	
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", age=" + age + "]";
	}
	
}
