package com.google;
import java.util.Scanner;

public class PrimeNumber
{
public static void main(String[] args)
{
	int temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	for(int i=2; i<=num/2; i++)
	{
		if(num%i==0)
		{
			temp=1;
			
		}
	}
	if(temp==0)
	{
		System.out.println(num+ " number is prime number");
	}
	else
	{
		System.out.println(num+ " number is not prime number");
	}
	
}
}
