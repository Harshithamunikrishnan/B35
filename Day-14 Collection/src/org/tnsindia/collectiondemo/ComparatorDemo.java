package org.tnsindia.collectiondemo;
import java.util.Arrays;
public class ComparatorDemo {

	public static void main(String[] args) {
		Student st[]=new Student[2];
		
		st[0]=new Student();
		st[0].setMarks(90);
		st[0].setName("Demet");
		
		st[1]=new Student();
		st[1].setMarks(89);
		st[1].setName("Harshu");
		
		//Sorting the marks
		Arrays.sort(st,new MarksComparator());
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Student"+(i+1)+"Name: "+st[i].getName());
		}
		
	}

}
