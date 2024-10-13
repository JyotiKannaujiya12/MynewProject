package com.google;
import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) 
	{
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the leap year");
	int year=s.nextInt();
	//int year=2016;
		if((year%400==0)||(year%4==0 && year%100!=0))
		{
			System.out.println("Year is leap year");
		}
		else
		{
			System.out.println("Year is not leap year");
		}
	}

}
