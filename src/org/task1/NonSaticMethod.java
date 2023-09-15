package org.task1;

public class NonSaticMethod {
	int a=10;
	public void m2() {
		System.out.println("Method 2");
	}
	public void m1() {
		System.out.println("Method 1");
		m2();
		System.out.println(a);
	}
	public static void main(String[] args) {
		NonSaticMethod n=new NonSaticMethod();
		n.m1();
	}

}
