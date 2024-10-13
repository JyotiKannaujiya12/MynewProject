package com.google;
import java.util.Scanner;

public class PelindromeNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=s.nextInt();
		int rem,rev=0;
		
		int num2;
		num2=num1;
		while(num1!=0)
		{
		rem=num1%10;
		rev=rev*10+rem;
		num1=num1/10;
		}
		if(num2==rev)
		{
		System.out.println("number is pelindrome= "+num2);
		
	}
	else
	{
	System.out.println("number is not pelindrome= "+num2);	
	}
	}

}
