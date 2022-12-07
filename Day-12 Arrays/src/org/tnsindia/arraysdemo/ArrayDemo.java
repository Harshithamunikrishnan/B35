package org.tnsindia.arraysdemo;
//Demo on arrays
public class ArrayDemo {

	public static void main(String[] args) {
		//multiple ways to declare and initialize the array
		int[] arr= {10,20,30,40,50,60};
		char[] arr1= {'A','c','D','e','B'};
		
		//the values inside the arr1 is char but type is int so it will convert into ASCII value
		int[] arr11= {'A','c','D','e','B'};
		float arr2[]= {20.3f,50.7f,40.6f,66.5f};
		int arr3[]=new int[5];
		arr3[0]=23;
		arr3[1]=56;
		arr3[2]=45;
		arr3[3]=77;
		arr3[4]=75;
		
		System.out.println("The array element is: "+arr[4]);
		System.out.println("The array element is: "+arr1[4]);
		System.out.println("The array element is: "+arr11[3]);
		System.out.println("The array element is: "+arr2[1]);
		
		//to print all the array elements using enhanced (for each) for loop
		for(int itr:arr3)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		
		//to print all the  array elements using for loop
		for(char i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+ " ");
		}
		
	}
}
