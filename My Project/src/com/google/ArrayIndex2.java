package com.google;

public class ArrayIndex2
{

	public void details()
	{
		int num[]= {10,20,30,40,50,600};
		try
		{
			System.out.println(num[1]);
			System.out.println(num[3]);
			System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args)
	{
		ArrayIndex2 obj=new ArrayIndex2();
		obj.details();
		System.out.println("Program completed");
	}
}
