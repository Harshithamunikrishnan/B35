package org.tnsindia.arraysdemo;
//demo to know the class of array
public class ArrayExample {

	public static void main(String[] args) {
		//String[] arr={"Rose","Lily","Jasmine","Lotus"};//String
		//int arr[]={34,87,23,12,40};//I
		float arr[]= {43.f,76.8f,45.0f,43.1f};//F
		/*getClass() Returns the runtime class of this Object*/
		/*getName() Returns the canonical name of the underlying class as defined by the 
		 * Java Language Specification. */
		System.out.println(arr.getClass().getName());
		
		

	}

}
