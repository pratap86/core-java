package com.pratap.corejava.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			
			System.out.println(myClass.getName());
			
			Constructor<?>[] constructors = myClass.getConstructors();
			
			System.out.println(Arrays.toString(constructors));
			
			System.out.println(Arrays.toString(myClass.getMethods()));
			
			//invoke default constructor
			
			Constructor<?> constructor = myClass.getConstructor(null);
			
			Object calcObj = constructor.newInstance(null);
			
			System.out.println(calcObj);
			
			//invoke parameterize constructor
			
			Constructor<?> constructor2 = myClass.getConstructor(int.class, int.class);
			
			Object calcObj2 = constructor2.newInstance(5, 5);
			System.out.println(calcObj2);
			
			Method sumObject = myClass.getMethod("sum", int.class, int.class);

			Object invoke = sumObject.invoke(calcObj, 5, 5);
			
			Method getxMethod = myClass.getMethod("getX", null);
			Object invoke2 = getxMethod.invoke(calcObj2, null);
			
			System.out.println(invoke2);
			
			System.out.println(invoke);
			
			// access private field and set that value
			Field numField1 = myClass.getDeclaredField("x");
			numField1.setAccessible(true);
			numField1.set(calcObj, 80);
			System.out.println(invoke2);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
