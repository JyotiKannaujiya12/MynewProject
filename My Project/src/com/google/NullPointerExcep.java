package com.google;

public class NullPointerExcep 
{
public void  details()
{
	int age;
	try
	{
		System.out.println("age");
	}
	catch(NullPointerException e)
	{
		e.printStackTrace();
		
	}
	
}
public static void main(String[] args) 
{
	NullPointerExcep obj=new NullPointerExcep();
	obj.details();
}
}
