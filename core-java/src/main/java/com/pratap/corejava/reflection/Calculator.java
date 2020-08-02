package com.pratap.corejava.reflection;
@MyAnnotation(value1 = "123", value2 = "ABC")
public class Calculator {

	private int num1; 
	
	private int num2;
	
	public Calculator() {
		System.out.println("default constructor");
	}

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
}
