package com.tnsif.arraydemo;

class MLArray{
	static void printArray(int arr[][])
	{
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

public class MultiDimensionArray {
	

	public static void main(String[] args) {
		
		// int arr[][] = new int [2][3]; // heap
		
		int arr[][] = { { 10, 20, 30 },{1,2},{23}, { 25, 40, 50 } }; // stack
		
		System.out.println("No. of Rows in arr array :"+ arr.length);
		MLArray.printArray(arr);
			
	}

}
