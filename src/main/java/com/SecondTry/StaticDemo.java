package com.SecondTry;

class Base{
	public static void display() {
		System.out.println("Display method of Base class.");
	}
}

class Derived extends Base{
	public static void display1() {
		System.out.println("Display method of Derived class.");
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Derived.display();  
	}

}
