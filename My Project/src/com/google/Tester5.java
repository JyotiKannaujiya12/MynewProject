package com.google;

public class Tester5 
{
public static void main(String[] args)
{
	Mythread5 t1=new Mythread5();
	t1.start();
	try
	{
		System.out.println("Thread priority="+t1.getPriority());
		t1.setPriority(8); 
		System.out.println("Update Thread priority=" +t1.getPriority());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}
