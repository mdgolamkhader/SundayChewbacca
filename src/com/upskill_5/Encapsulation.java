package com.upskill_5;

public class Encapsulation {
	
	private String name = "Rasha";  // read & write only
	private int SSN = 123456;             // write only
	private String username= "Upskill";         //read only
	
	//setter method- name
	
	public void setName(String value){    // set the data-write
		name= value;
		
	}
	
	//getter method- name
	
	public String getName(){              //get the data-read
		return name;
		
	}
	
	//setter method- ssn
	
		public void setSSN(int value){    // set the data-write
			SSN = value;
		}
		
		//getter method- username
		
		public String getUsername(){              //get the data-read
			return username;  
		}
	
	public static void main(String[] args)
	{
		Encapsulation obj= new Encapsulation();
		obj.setName("Rasha");
		System.out.println(obj.getName());
		obj.setSSN(123456);
		System.out.println(obj.getUsername());
			
	}
}
