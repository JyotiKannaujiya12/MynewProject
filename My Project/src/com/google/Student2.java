package com.google;

public class Student2
{
public void display()
{
	System.out.println("display method running in student class");
	
}
public void details()
{
	this.display();
	System.out.println("details method running in student class ");
}
public static void main(String[] args) 
{
	Student2 s1=new Student2();
	s1.details();
}
}
