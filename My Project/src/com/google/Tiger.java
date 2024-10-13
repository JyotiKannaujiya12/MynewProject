package com.google;

public class Tiger extends Animal
{
public String color="Black";
public void display()
{
	System.out.println("Tiger color="+color);
	System.out.println("Animal color=" +super.color);
	
}
public static void main(String[] args) 
{
	Tiger t=new Tiger();
	t.display();
}
}
