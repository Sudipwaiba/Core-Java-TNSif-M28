package com.tnsif.arraydemo;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {


		int n=5;
		// declares an array of integers
		Student[] arr;
		// allocating memory for 5 objects of type student
		arr=new Student[n];
		// initialize the first elements of the array
		arr[0]=new Student(1, "sudip","mar");
		arr[1]=new Student(2,"waiba","feb");
		//so on ......
		arr[2]=new Student(5, "nyana","may");
		arr[3]=new Student(6, "mam","we");
		arr[4]=new Student(7, "excellent","are");
		
		// accessing the elements of the specified array
		for(int i=0; i<arr.length;i++) {
			System.out.println("Element at "+i+ " : "+arr[i].getRollNo()+" "+arr[i].getName()+" "+arr[i].getYear());
		}
		
	}

}
