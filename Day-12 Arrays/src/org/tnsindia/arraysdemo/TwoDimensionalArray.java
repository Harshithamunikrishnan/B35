package org.tnsindia.arraysdemo;
//demo on 2D array or arrays of array
public class TwoDimensionalArray {

	public static void main(String[] args) {
		/*int [][]arr={{22,33,44},{45,66,75},{37,89,42}};//[3][3]
		 System.out.println(arr[0][2]);//44
		 System.out.println(arr[1][0]);//45
		 System.out.println(arr[2][1]);//89
		 System.out.println("Array elements are:");
		 //to print array elements
		  for(int i=0;i<3;i++)
		  {
		      for(int j=0;j<3;j++)
		      {
		         System.out.println(arr[i][j]+" ");
		      }
		      System.out.println();
		      
		  }*/
		
		int [][]arr=new int[3][3];
		arr[0][0]=22;
		arr[0][1]=33;
		arr[0][2]=44;
		arr[1][0]=45;
		arr[1][1]=66;
		arr[1][2]=75;
		arr[2][0]=37;
		arr[2][1]=89;
		arr[2][2]=42;
		
		System.out.println("Array elements are:");
		//to print array elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
