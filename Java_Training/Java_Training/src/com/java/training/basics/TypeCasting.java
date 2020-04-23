package com.java.training.basics;

public class TypeCasting {

	public static void main(String[] args) {

		int i = 100;
		long l = i; // Widening or Automatic type conversion
		float f = l; // no explicit type casting required
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);

		double d = 100.04;
		l = (long) d; // Narrowing or Explicit type conversion
		i = (int) l; // explicit type casting required

		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);

	}

}
