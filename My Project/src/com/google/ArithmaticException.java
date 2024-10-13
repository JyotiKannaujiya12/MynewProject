package com.google;
import java.util.Scanner;

public class ArithmaticException 
{
public void div(int n,int m)
{
	int res;
	try
	{
		res=n/m;
		System.out.println("Division result=" +res);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1=s.nextInt();
	System.out.println("Enter the second number:");
	int num2=s.nextInt();
	ArithmaticException obj=new ArithmaticException ();
	obj.div(num1,num2);
	System.out.println("Program completed");
}
}
