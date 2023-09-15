package org.task;

public class StudentDB {
	private String name;
	private int regno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("Abi"))
		this.name = name;
		else if(name.equals("Bhuvana"))
		this.name=name;
		else if(name.equals("Barath"))
			this.name=name;
		else
			this.name="Invalid data";
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		if(regno==9052301)
		this.regno = regno;
		else if(regno==9052302)
			this.regno=regno;
		else if(regno==9052303)
			this.regno=regno;
		else
			this.regno=0;
		
	}


}
