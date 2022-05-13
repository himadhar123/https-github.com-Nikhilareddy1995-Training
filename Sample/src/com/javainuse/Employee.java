package com.javainuse;

public class Employee extends A implements A1, A2 {

	@Override
	public void add() {
		System.out.println("india");
		
	}

}

class A {
	public void add() {
		System.out.println("hi");
	}
}

class B {
	public void add() {
		System.out.println("hello");
	}
}

interface A1 {
	public void add();
}

interface A2 {
	public void add();
}
