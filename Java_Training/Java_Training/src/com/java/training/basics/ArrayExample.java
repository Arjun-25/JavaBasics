package com.java.training.basics;

public class ArrayExample {

	int[] age;

	public ArrayExample() {

		// create an array of length 5
		age = new int[5];

		// int[] age ={1,2,3,4,5};

		// age[0] = 1;

		// access each element of the array using the index number
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
	}

	public static void main(String[] args) {

		ArrayExample arrayExample = new ArrayExample();

		arrayExample.setAge(new int[] { 1, 2, 3, 4, 5 });

		System.out.println("**************");

		for (int i : arrayExample.getAge()) {
			System.out.println(i);
		}
	}

	public int[] getAge() {
		return age;
	}

	public void setAge(int[] age) {
		this.age = age;
	}
}
