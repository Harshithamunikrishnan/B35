package org.tnsindia.collectiondemo;

import java.util.SortedSet;
import java.util.TreeSet;
//SortedSet arrange the elements in an ascending order

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer>obj=new TreeSet<>();
		obj.add(300);
		obj.add(120);
		obj.add(22);
		obj.add(146);
		System.out.println(obj);
		//to extract the elements from set
		for(Integer itr:obj)
		{
			System.out.println(itr+" ");
		}
	}

}
