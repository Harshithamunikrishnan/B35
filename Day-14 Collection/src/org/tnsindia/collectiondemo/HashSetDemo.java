package org.tnsindia.collectiondemo;

import java.util.HashSet;
import java.util.Set;
//Demo on Set Interface
//to implement the set use HashSet/LinkedHashSet
public class HashSetDemo {

	public static void main(String[] args) {
		//Set is an unordered so when it prints the element it will print in any order
		Set<Integer>obj=new HashSet<>();
		obj.add(56);
		obj.add(89);
		obj.add(42);
		obj.add(76);
		System.out.println(obj);
		//to extract the elements from set
		for(Integer itr:obj)
		{
			System.out.println(itr+" ");
		}
	}

}
