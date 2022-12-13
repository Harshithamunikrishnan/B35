package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

//demo on CollectionInterface

public class DemoOnCollectionInterface {
	
	//@SuppressWarnings("Unchecked")
     public static void main(String[] args) {
    	 //Collection is an interface, we cannot instantiate it.
    	//@SuppressWarnings("rawtypes")
    	 Collection<Object> obj=new ArrayList<>();
    	 obj.add("FullStack");
    	 obj.add(133);
    	 obj.add('x');
    	 obj.add(14.5f);
    	 System.out.println("The Collection Elements Are: "+obj);
    	 //to extract the elements from arraylist
    	 for(Object itr:obj)
    	 {
    		 System.out.println(itr+"");
    	 }
		}
}
