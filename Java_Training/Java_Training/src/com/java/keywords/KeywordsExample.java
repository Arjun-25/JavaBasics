package com.java.keywords;

class Parent {

	Parent() {
		System.out.println(this);
		System.out.println("Parent");
	}
}

public class KeywordsExample extends Parent {
	
	int i = 10;

	KeywordsExample() {
		super();
		System.out.println("Sub");
	}

	public static void main(String[] args) {
		KeywordsExample sub = new KeywordsExample();
		sub.display();
	}

	private void display() {
		System.out.println(this);
		System.out.println(this.i);
	}
}