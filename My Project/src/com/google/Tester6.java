package com.google;

public class Tester6 
{
	public static void main(String[] args) {
		
	
	MyThread6 t1=new MyThread6();
	t1.start();
	try
	{
		t1.join();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	for(int j=1; j<=500; j++)
	{
		System.out.println("job-2");
	}
}
}