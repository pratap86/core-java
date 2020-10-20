package com.pratap.corejava.operator;
/**
 * 
 * @author 835698
 * short circuit operator(&& and ||), only apply over the boolean variables
 * faster than Bitwise operator(& and |), these evaluates both operands, and applicable on integers and boolean types
 * while in case, short circuit operator, second args evaluation is optional
 */
public class ShortCircuitOperators {

	public static void main(String[] args) {

		boolean x = true; boolean y = false;
		
		if(x || y) {
			System.out.println("inside if");
		}
	}

}
