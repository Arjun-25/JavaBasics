package com.java.training.basics;

public class Sample {
	
	int i;
	int y;

	public Sample(int i, int y) {
		// Constructor
		
		this.i = i;
		this.y = y;
	}

	public static void main(String[] args) {

		Sample sample = new Sample(4,5);
		sample.calculate(sample);
		
		sample.setI(6);
		sample.setY(7);
		sample.calculate(sample);
	}

	private void calculate(Sample sample) {

		System.out.println(this.i + this.y);
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
