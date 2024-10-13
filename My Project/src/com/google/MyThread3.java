package com.google;

public class MyThread3 extends Thread
{
public void run()
{
for(int i=1; i<=50; i++)
{
	System.out.println("job-1");
	try
	{
		Thread.sleep(1000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
}
}
}
