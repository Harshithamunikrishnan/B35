package org.tnsindia.thiskeyworddemo;
//4. this keyword can be used to return current class instance
public class Food {
	
	//data members 
	public String Food_type;
	public String Food_name;
	
	//default constructor
	Food()
	{
		Food_type="Chinese";
		Food_name="Gobi Manchurian";
		
	}
	
	/*the below method is returning the current class instance by
	  using this keyword*/
	Food get1()
	{
		System.out.println("Food Type is: "+Food_type+"");
		System.out.println("Food Name is: "+Food_name+"");
		return this;
	}
	
	/*public void display()
	 {
	 System.out.println("Food Type is: "+Food_type+"") 
	 System.out.println("Food Name is: "+Food_name+"");
	 }*/

}
