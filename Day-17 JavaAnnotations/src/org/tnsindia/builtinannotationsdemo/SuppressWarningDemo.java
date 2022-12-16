package org.tnsindia.builtinannotationsdemo;

import java.util.ArrayList;

public class SuppressWarningDemo {
	
	//used to solve the compile time warning
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();
    	 obj.add(45);
    	 obj.add(78);
    	 obj.add("Harshu");
    	 obj.add(90.3);
    	 System.out.println(obj);
	}

}
