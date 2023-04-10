package com.tnsif.hierarchicalInh;

public class Student extends Person {

	private String className;
	private float per;
	
	public Student() {
		System.out.println("Student cass constructor");
		className="AWS";
		per=32.2f;
		
	}
	
	
	
	public Student(String claaName, float per) {
		super();
		this.className = claaName;
		this.per = per;
	}
	public String getClaaName() {
		return className;
	}
	public void setClaaName(String claaName) {
		this.className = claaName;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [claaName=" + className + ", per=" + per + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
}
