package com.java8.method;

interface Clickable{
	default void click(){
		System.out.println("click");
	}
 
	default void print(){
		System.out.println("Clickable");
	}
}
 
interface Accessible {
	default void access(){
		System.out.println("access");
	}
 
	default void print(){
		System.out.println("Accessible");
	}
}
//@Author(name="John, James, Mark", method="print(), main(), access()")
//
//@Authors({ @Author(name="John", method="print()"),
//    @Author(name="James", method="main()"),
//    @Author(name="Mark", method="access()") })

@Author(name="John", method="print()")
@Author(name="James", method="main()")
public class Button implements Clickable, Accessible {
 
	public void print(){
		Clickable.super.print();//java 8 feature
		Accessible.super.print();
	}
 
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.access();
		button.print();
	}
}