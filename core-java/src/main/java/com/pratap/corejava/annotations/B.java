package com.pratap.corejava.annotations;

public class B {

	@SuppressWarnings(value = { "deprecation" })
	public static void main(String[] args) {

		A a = new A();
		a.m1();
		a.m2();
	}

}
