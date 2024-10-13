package com.google;
import java.util.Scanner;
public class Pattern 
{

	public static void main(String[] args)
	
	{
		//I
		//IN
		//IND
		//INDI
		//INDIA
		String s1="INDIA";
		//Scanner s=new Scanner (System.in);
		//System.out.println("Enter string value");
		String s2[]=s1.split(" ");
		for(int i=0; i<s1.length(); i++)
		{
			System.out.println(s1.substring(0, i+1));
		}
//Pattern 
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
for(int i=1; i<=5; i++)
{
	for(int j=1;j<=i; j++)
	{
		System.out.print(" *");
		
	}
	System.out.println();
}

}
}