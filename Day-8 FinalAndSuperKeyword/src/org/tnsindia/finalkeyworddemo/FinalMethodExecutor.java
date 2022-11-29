package org.tnsindia.finalkeyworddemo;

public class FinalMethodExecutor {

	public static void main(String[] args) {
		FinalMethodWithChild f=new FinalMethodWithChild ();
		f.aadhar_no=231234562142L;
		f.PAN_no="ABD162230";
		//f.print();
		f.print(f.PAN_no);

	}

}
