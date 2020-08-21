package com.pratap.corejava.flowcontrol.iterative;

public class LabelledBLock {

	public static void main(String[] args) {

		int x = 20;
		
		l1:{
			System.out.println("label begins..");
			
			if(x == 20) break l1;
			System.out.println("label end");
		}
		System.out.println("outside label");
	}

}
