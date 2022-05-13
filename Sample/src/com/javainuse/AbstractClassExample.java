package com.javainuse;
// 0 to 100% hiding
public abstract class AbstractClassExample {
	int a=10;
	int b;
	public AbstractClassExample() {
		
	}
	//method
	public void add() {
		System.out.println("hi");
	}
	//declaration -- wont be any implementation
	public abstract void sub(int a, int b);
	
	public abstract void mul(int a, int b);
		
	
	public static void main(String[] args) {
		//AbstractClassExample ab=new AbstractClassExample();
	}

}
