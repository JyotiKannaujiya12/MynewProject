package com.google;

public class Tiger2 extends Animal2
{
public void eat()
{
	super.eat();
	System.out.println("Tiger2 eating");
}
public void roar()
{
	System.out.println("Tiger roaring");
}
public static void main(String[] args) 
{
	Tiger2 t=new Tiger2();
	t.eat();
	t.roar();
}
}
