package org.task;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stu {
public static void main(String[] args) {
	StudentDB s=new StudentDB();
	s.setName("Abi");
	s.setRegno(9052301);
	
	StudentDB s1=new StudentDB();
	s1.setName("Bhuvana");
	s1.setRegno(9052302);
	
	StudentDB s2=new StudentDB();
	s2.setName("Barath");
	s2.setRegno(9052303);
	
	StudentDB s4=new StudentDB();
	s4.setName("Bharath");
	s4.setRegno(9052305);
	
	String name = s.getName();
	System.out.println(name);
//	Map<Integer,StudentDB> m=new LinkedHashMap();
//	m.put(1, s);
//	m.put(2, s1);
//	m.put(3, s4);
//	
//	Set<Entry<Integer, StudentDB>> entrySet = m.entrySet();
//	for (Entry<Integer, StudentDB> entry : entrySet) {
//		
//		StudentDB value = entry.getValue();
//		
//		System.out.println(value.getName());
//		System.out.println(value.getRegno());
//		System.out.println("_________");
//	}
	
	
//	Set<StudentDB> set=new LinkedHashSet();
//	set.add(s);
//	set.add(s1);
//	set.add(s2);
//	set.add(s4);
//	
////	System.out.println(set);
//	
//	for (StudentDB studentDB : set) {
//		System.out.println(studentDB.getName());
//		System.out.println(studentDB.getRegno());
//		System.out.println("_________");
//	}
//
	
}
}
