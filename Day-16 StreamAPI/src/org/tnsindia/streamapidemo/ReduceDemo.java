package org.tnsindia.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(14,21,28,35,42);
		Optional<Integer> result = intList.stream().reduce((a,b)->(a<b)?a:b);
		if(result.isPresent()) {
			System.out.println("Result:"+result.get());
		}
	}

}
