package com.java.keywords;

class Counter {
	static int count = 0;// will get memory only once and retain its value  

	Counter() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}
}
