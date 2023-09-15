package org.Testing;

import java.security.GeneralSecurityException;

public class SingleTon {

	static SingleTon s;

	private SingleTon() {

	}

	public static SingleTon getInstance() {
		if (s == null) {
			s = new SingleTon();
		}
		return s;

	}

	public static void main(String[] args) {
		SingleTon instance = getInstance();
		System.out.println(System.identityHashCode(instance));
		
		SingleTon instance2 = getInstance();
		System.out.println(System.identityHashCode(instance2));
	}

}
