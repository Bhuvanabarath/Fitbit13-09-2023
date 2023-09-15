package org.Testing;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DataTable {
	public static void main(String[] args) {
		//1D without header
		List l=new LinkedList();
		l.add("Bhuvana");
		l.add("Barath");
		l.add("Abi");
		l.add("Vino");
		
		System.out.println(l.get(3));
		System.out.println("1*************");
		//1D with header
		Map<String,String> m=new LinkedHashMap();
		m.put("Name", "Bhuvana");
		m.put("Place", "Chennai");
		m.put("Username", "Abibhuvana");
		m.put("Password", "Bhuvana@1530");
		
		System.out.println(m.get("Name"));
		System.out.println("1H*************");
		//2-D without Header
		List<List<String>> li=new ArrayList();
		List<String> l1=new ArrayList();
		l1.add("101");
		l1.add("Bhuvana");
		l1.add("Bhuvana@gmail.com");
		
		List<String> l2=new  ArrayList();
		l2.add("102");
		l2.add("Barath");
		l2.add("Barath@gmail.com");
		
		List<String> l3=new ArrayList<>();
		l3.add("103");
		l3.add("Abi");
		l3.add("Abi@gmail.com");
		
		
		li.add(l1);
		li.add(l2);
		li.add(l3);
		
		List<String> list = li.get(1);
		String string = list.get(1);
		System.out.println(string);
		System.out.println("2*************");
		
		List<Map<String,String>> map=new LinkedList();
		Map<String, String> m1=new LinkedHashMap();
		m1.put("id", "101");
		m1.put("name", "Bhuvana");
		m1.put("mail", "Bhuvana@gmail.com");
		
		Map<String,String> m2=new LinkedHashMap();
		m2.put("id", "Barath");
		m2.put("name","102");
		m2.put("mail","Barath@gmail.com");
		
		Map<String,String> m3=new LinkedHashMap();
		m3.put("id", "Abi");
		m3.put("name", "Abi");
		m3.put("mail", "Abi@gmail.com");
		
		map.add(m1);
		map.add(m2);
		map.add(m3);
		
		Map<String, String> map2 = map.get(2);
		System.out.println(map2.get("name"));
		System.out.println("2D*************");
	}
	
	
	
	
	
}
