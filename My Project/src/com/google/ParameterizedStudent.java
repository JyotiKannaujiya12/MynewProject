package com.google;

public class ParameterizedStudent 
{
String name;
int age;
public ParameterizedStudent(String name,int age)
{
  this.name=name;
	this.age=age;
}
public void display()
{
	System.out.println("Student name = "+name);
	System.out.println("Student age = "+age);
	
}
public static void main(String[] args) 
{
	ParameterizedStudent s5=new ParameterizedStudent ("jyoti",22);
	s5.display();
	ParameterizedStudent s6=new ParameterizedStudent ("monika",23);
	s6.display();
}

}
