package org.tnsindia.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//demo on HashMap
//HashMap prints the value in an unordered manner and LinkedHashMap prints an ordered wise
//TreeMap prints the entries according to ascending orders of keys

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new TreeMap<>();
		//Map<Integer,String>obj=new HashMap<>();
		//Map<Integer,String>obj=new LinkedHashMap<>();
		obj.put(101, "Hazel");
		obj.put(102, "Hazal");
		obj.put(103, "Roza");
		obj.put(104, "Deniz");
		System.out.println(obj);
		
		obj.remove(103);//it removes the entire entry for key 103
		System.out.println(obj);
		//to extract the entry from a map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
