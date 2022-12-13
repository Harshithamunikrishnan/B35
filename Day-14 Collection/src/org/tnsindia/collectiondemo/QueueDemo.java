package org.tnsindia.collectiondemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.add(23);
		obj.add(42);
		obj.add(1);
		obj.add(33);
		System.out.println(obj);
		}
}
