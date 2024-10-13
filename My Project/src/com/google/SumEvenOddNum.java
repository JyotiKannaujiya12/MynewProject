package com.google;
import java.util.Scanner;
public class SumEvenOddNum 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
	int esum=0, oddsum=0,rem;
   while(num!=0)

	{
	   rem=num%10;
		if(rem%2==0)
		{
		esum=esum+rem;
	}
	else
	{
		oddsum=oddsum+rem; 
	}
		num=num/10;
	}
	System.out.println("Even number" +esum);
	System.out.println("odd number" +oddsum);
	
}
}
