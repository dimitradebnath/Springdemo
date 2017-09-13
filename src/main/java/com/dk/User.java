package com.dk;

public class User {
	private String name;
	private String mobileno;
	private String collegename;
	
	public User(String name, String mobileno, String collegename) {//Put int here it doesnt run
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.collegename = collegename;
	}
	public void showinfo()
	{
		System.out.println("Name:-"+name);
		System.out.println("Mobilenumber:-"+mobileno);
		System.out.println("Collegename:-"+collegename);
	
	}
	public void intialisation() {
		System.out.println("Initialised");
	}
	public void destroy() {
		
		System.out.println("destroyed");
	
	}

}
