package com.google;

public class Tester4 
{
public static void main(String[] args) 
{
	MyThread4 t1=new MyThread4();
	t1.start();
	try
	{
		System.out.println("Thread name="+t1.getName());
		t1.setName("XYZ");
		System.out.println("Update Thread name="+t1.getName());
	}
 
	catch(Exception e)
	{
		e.printStackTrace();
		
	
}
}
}

