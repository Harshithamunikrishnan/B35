package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Dia","Ozge","Swetha","Emanuel"); 
		//for-each-terminal operation
		obj.forEach((i)->System.out.println(i+ " "));
		
		System.out.println();
		//A stream can be obtained from sources like arrays or collections using "stream" method
		//To obtain stream from array, use java.util.Arrays class
		List<Integer>obj1=Arrays.asList(new Integer[] {45,60,87,55});
		obj1.forEach((i)->System.out.println(i+ " "));
		
		System.out.println();
		Set<String>obj2=new HashSet<>();
		obj2.add("Joe");
		obj2.add("Harry");
		obj2.add("Emma");
		obj2.add("Sara");
		System.out.println(obj2);
		obj2.forEach((i)->System.out.println(i+ " "));
		/*for(String str:obj2)
		{
			System.out.println(str);
		}*/
	
	}
}
