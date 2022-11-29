package org.tnsindia.abstractdemo;

public  class Employee extends Person {
	
	private int ID;
	public Employee(String name, String gender, int id) {
		super(name, gender);
		ID=id;
	}
	@Override
	public void work() {
		
		if(ID>0)
		{
			System.out.println("Employee Exists");
		}
		else
		{
			System.out.println("Employee Does Not Exixts");
		}
		
	}
	
}
