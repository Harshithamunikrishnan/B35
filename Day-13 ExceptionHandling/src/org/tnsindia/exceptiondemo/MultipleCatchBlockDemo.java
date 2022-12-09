package org.tnsindia.exceptiondemo;
//demo on MultipleCatchBlock
public class MultipleCatchBlockDemo {

	public static void main(String[] args)  {
		try {
			//by default it takes 0 as we have not passed any argument to args
			int a=args.length;
			System.out.println("The length of a is: "+a);
			int b=16/a;
			System.out.println(b);
			int arr[]= {20,45,27};
			System.out.println(arr[4]);
			String x=null;
			System.out.println(x.length());
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}*/
		
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		//default exception-parent catch block 
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}
	}

}
