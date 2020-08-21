package com.pratap.corejava.flowcontrol.iterative;
/**
 * 
 * @author 835698
 * WAP to print the odd number in between 0 to 9
 */
public class ContinueDemo {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}

}
