package com.google;

public class NumFormateException 
{
	
public void display()
{
	try
	{
		String s1="500";
		String s2="Lucknow";
		int num1=Integer.parseInt(s1);
		System.out.println("num1="+num1);
		 int num2=Integer.parseInt(s2);
		 System.out.println("num2="+num2);
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
		
	}
}
	public static void main(String[] args)
	{
		NumFormateException obj= new NumFormateException();
		obj.display();
		System.out.println("Program completed");
	}
	
	
}

