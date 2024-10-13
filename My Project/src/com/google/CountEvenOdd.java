package com.google;

import java.util.Scanner;

public class CountEvenOdd
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	int ecount=0, ocount=0,rem;
	while(num!=0)
	{
		rem=num%10;
		if(rem%2==0)
		{
			ecount++;
		}
		else
		{
			ocount++;
		}
		num=num/10;
		
	}
	System.out.println("Even digit count" +ecount);
	System.out.println("odd digit count"+ocount);
}

}
