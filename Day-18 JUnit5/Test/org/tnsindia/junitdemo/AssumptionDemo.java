package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Roja","Henna");
		//Execute the body when the positive condition else test will be skipped
		Assumptions.assumeTrue("Henna".equals(System.getProperty("Roja")));
	}
	
	@Test
	void display() {
		System.setProperty("Roja","Henna");
		//Execute the body when the negative condition else test will be skipped
		Assumptions.assumeFalse("Dia".equals(System.getProperty("Roja")));
	}
	

}
