package com.tnsif.arraydemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {


		// get the array
		 int intArr[]= {10,200,30,4,50};
		 
		 // print the array
		 System.out.println(Arrays.toString(intArr));
		 
		 Arrays.sort(intArr);
		 System.out.println(Arrays.toString(intArr));

		 for(int i=intArr.length-1;i>=0;i--) {
//			 int arr[] = Arrays.toString(intArr[i]);
			 System.out.println("the reverse of the array is " +intArr[i]); 
		 }
		 
		 
		 int key=30;
		 System.out.println("key is present at index " +Arrays.binarySearch(intArr, key));
		 
		System.out.println("key is present at index "+ Arrays.binarySearch(intArr, 3, 4, key));
		 
		// get second array
		int intArr1[]= {10,200,30,4,50};
		System.out.println(Arrays.toString(intArr));
		 
		//compare the arrays
		if(Arrays.compare(intArr, intArr1)==0) {
			System.out.println("both the arrays are equal");
		}
		else {
			System.out.println("both the arrays not equal");
		}
		
		// copy array
		int intArr2[] = Arrays.copyOf(intArr, 10);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[] =Arrays.copyOfRange(intArr, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		// fill the arrays
		Arrays.fill(intArr3, key);
		System.out.println(Arrays.toString(intArr3));
		
		 
		 
		 
		 
	}
	

}
