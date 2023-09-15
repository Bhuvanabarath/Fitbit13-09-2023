package org.task;

public class Student extends Hostel {
	public void name()  {
		System.out.println("Bhuvana");
	}
	public void id() {
		System.out.println("2045732");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.name();
		s.id();
		s.hostelName();
		s.address();
	}
}
