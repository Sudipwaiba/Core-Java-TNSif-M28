package com.tnsif.arraydemo;

class ArrayOperations{
	
	

	//print int array
	static void printArray(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println( );
	}
	
	// variable argument function
	
	public static int getSum(int...n) {
		
		int sum=0;
		for(int no:n)  // for each loop is auto implement
			sum+=no;
		return sum;
		
	}
	
	// count no. of odd elements
	public static int getOddCount(int b[])
	{
		int count =0;
		for(int i=0;i<b.length;i++) 
		{
			if (b[i]%2!=0)
				count++;
		}
		return count;
	}
	//count no. of even elements
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
}


//driver class

public class ArrayDemoOne {
	public static void main(String[] args) {
		
		int n=10;
		int a[];
		a= new int [n]; // instantiation
		
		
		ArrayOperations.printArray(a);
		
		// assign the values
		for(int i=0;i<a.length;i++) {
			a[i]=5*i;
		}
		ArrayOperations.printArray(a);
		
		int b[]= {10,20,30,40,50};
		
	    System.out.println(	ArrayOperations.getSum(b));
	    
	    b[2]=67;
	    ArrayOperations.printArray(b);
	    
//	    b[7]=26;
//	    ArrayOperations.printArray(b);
	    
	    
	    int o=ArrayOperations.getOddCount(b);
	    System.out.println("odd numbers "+o);
	    
	    int o1=ArrayOperations.getEvenCount(b);
	    System.out.println("even numbers "+o1);
	    
//	    int c[];
//	    ArrayOperations.printArray(c);
	    
	    
		
	}
	

}

