package org.task;

public class InstanceVariable {
	int a;
	public int mathod1(int a) {
		this.a=a;
		return a;
		
	}
	public static void main(String[] args) {
		InstanceVariable i=new InstanceVariable();
		
		i.mathod1(20);
		System.out.println(i.a);
		System.identityHashCode(i);
	}
}
