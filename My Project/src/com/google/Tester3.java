package com.google;

public class Tester3 
{
public static void main(String[] args)
{
	MyThread3 t1=new MyThread3();
	t1.start();
	for(int j=1; j<=50; j++)
	{
		System.out.println("job-2");
	}
}
}
