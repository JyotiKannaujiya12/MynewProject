package com.google;

import java.util.Scanner;

public class SumOfDigitNum 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	int sum=0,rem;
	while(num!=0)
	{
		rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	System.out.println("sum of Digit = " +sum);
}
}
