package org.tnsindia.builtinannotationsdemo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyCustom
{
	//abstract method
	String print();
}
class MyCustomAnnotations
{
	@MyCustom(print="C2TC-JFS")
	public void display()
	{
		System.out.println("Life Is Wonderful!");
		
	}
}
//driver class 
public class CustomAnnotationsDemo {

	public static void main(String[] args) throws NoSuchMethodException, Exception   {
		MyCustomAnnotations m=new MyCustomAnnotations();
		m.display();
		Method m1=m.getClass().getMethod("display");
		MyCustom obj=m1.getAnnotation(MyCustom.class);
		System.out.println(obj.print());
		}

}
