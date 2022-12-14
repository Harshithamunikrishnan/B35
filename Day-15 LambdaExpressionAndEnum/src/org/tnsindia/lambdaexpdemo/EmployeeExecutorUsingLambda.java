package org.tnsindia.lambdaexpdemo;
//driver class
public class EmployeeExecutorUsingLambda {

	public static void main(String[] args) {
		/*implementing the functional interface-Employee using 
		 Lambda Expression with no parameter*/
		/*Employee obj=()->{
			System.out.println("Lambda expression with no parameter");
		};
		obj.dispaly();/*
		
		/*implementing the functional interface-Employee using 
		 Lambda Expression using two parameters */
		/*Employee obj=(int x,int y)->{
		int result=(a>b)?a:b;
		System.out.println("The maximum number is: "+result);
		return result;
	};
	obj.max(120,90);*/
		
		//lambda expression without return type
		Employee obj=(x,y)->(x>y)?x:y;
		System.out.println("The maximum number is: "+obj.max(120, 90));	
	}

}
