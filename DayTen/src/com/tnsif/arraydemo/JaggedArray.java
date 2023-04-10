package com.tnsif.arraydemo;

public class JaggedArray {

	public static void main(String[] args) {
		
		// declaration of jagged array
		int arr[][] = new int [4][];
		
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		arr[3]=new int[4];

		
		int count = 0;
		// initialize array
		
		// row
		for (int i = 0; i < arr.length; i++) {
			// column
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= count++;
			}
			
		}
		
		System.out.println(" welcome to Jagged array !!");
		System.out.println();
			System.out.println("no. of rows in arr array is :"+arr.length);
			System.out.println("Arrays elements are as follows : ");
			
			//row
			for (int i = 0; i <arr.length; i++) 
			{
				// column
				for (int j = 0; j <arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();

			}
		}
		
	

	

}
