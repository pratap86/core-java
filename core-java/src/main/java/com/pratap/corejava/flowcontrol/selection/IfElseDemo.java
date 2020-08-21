package com.pratap.corejava.flowcontrol.selection;

public class IfElseDemo {

	public static void main(String[] args) {

		int maths = 90; int physics = 70; int chemistry = 40;
		
		int avg = (maths+physics+chemistry)/3;
		
		if(maths < 35 | physics < 35 | chemistry < 35) {
			System.out.println("Failed");
		} else if(avg <= 50) {
			System.out.println("C-Grade");
		} else if(avg <= 65) {
			System.out.println("B-Grade");
		} else {
			System.out.println("A-Grade");
		}
		
	}

}
