package com.google;

public class Tester2 
{
	public static void main(String[] args) 
	{
		

	MyThread2 obj=new MyThread2();
	Thread t1=new Thread(obj);
	t1.start();
	for(int i=1; i<=50; i++)
	{
		System.out.println("job-2");
}
	}
}
