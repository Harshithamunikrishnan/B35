package org.tnsindia.collectiondemo;

import java.util.LinkedHashSet;
//demo on LinkedHashSet
/*HashSet is an unordered but LinkedHashSet is an ordered*/
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String>obj=new LinkedHashSet<String>();
		obj.add("Roja");
		obj.add("Hazel");
		obj.add("Danny");
		
		System.out.println(obj);
		//to extract the elements from set
		for(String itr:obj)
		{
			System.out.println(itr+" ");
		}

	}

}
