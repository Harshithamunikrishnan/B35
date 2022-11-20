package org.tnsindia.Constrcutordemo;
//driver class

public class ConstructorExecutor {

	public static void main(String[] args) {
		
		//object creation
		Employee e=new Employee();
		Employee e1=new Employee(35000,"Smitha");
		Employee e2=new Employee(40000,"Vruddhi");
		
		e1.print();
		e2.print();
	}

}
