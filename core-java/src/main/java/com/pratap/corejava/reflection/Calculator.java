package com.pratap.corejava.reflection;

public class Calculator {

	private int x, y;
	
	public Calculator() {
		System.out.println("default constructor");
	}

	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
}
