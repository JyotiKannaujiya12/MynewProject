package com.google;

public class Tester1 
{
public static void main(String[] args)
{
	MyThread t1=new MyThread();
	t1.start();
	for(int i=1; i<=50; i++)
	{
		System.out.println("job-2");
	}
}
}