package com.google;

public class MyThread2 implements Runnable
{

public void run()
{
	for(int i=1; i<=50; i++)
	{
		System.out.println("job-1");
	}
}
}
