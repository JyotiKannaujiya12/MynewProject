package com.google;

public class ArrayIndex 
{
	public void display()
	{
		int num[]= new int[5];
		try
		{
			num[0]=10;
			num[1]=11;
			num[2]=12;
			num[3]=13;
			num[4]=14;
			num[5]=15;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
	}
	public static void main(String[] args)
	{
		
	
		ArrayIndex obj=new ArrayIndex ();
		obj.display();
		System.out.println("program completed");
	}
}
