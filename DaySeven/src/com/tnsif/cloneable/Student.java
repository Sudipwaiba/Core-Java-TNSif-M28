package com.tnsif.cloneable;

public class Student implements Cloneable {
	
	int rollNo;
	String className;
	String name;
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollNo, String className, String name) {
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}
	
	public void printData() {
		System.out.println("Student [rollNo=" + rollNo + ", className=" + className + ", name=" + name + "]");
	}
	
	//override the clone method
	
	public Object clone() throws CloneNotSupportedException
	{
		
		return (Student)super.clone();
	}
	

}
