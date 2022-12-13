package org.tnsindia.collectiondemo;

import java.util.Comparator;

public class MarksComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int s1=((Student)o1).getMarks();
		int s2=((Student)o2).getMarks();
		if(s1>=s2)
		{
			System.out.println("Student1 has scored more marks");
		}
		else if(s1==s2)
		{
			System.out.println("Both students have scored equal marks");
		}
		else 
		{
			System.out.println("Student2 has scored more marks");
		}
		return 0;
	}
	
	

}
