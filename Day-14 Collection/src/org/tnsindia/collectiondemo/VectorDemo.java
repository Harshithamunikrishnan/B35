package org.tnsindia.collectiondemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> v=new Vector<>();
		v.add(15);
		v.add(1, 22);
		v.add(2, 45);
		System.out.println(v);
		for(Integer itr:v)
		{
			System.out.println(itr+"");
		}

	}

}
