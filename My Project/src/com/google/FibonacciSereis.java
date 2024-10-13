package com.google;
//import java.util.Scanner;

public class FibonacciSereis 
{
	public static void main(String[] args) 
	{
		int num1=0,num2=1;
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int term=s.nextInt();
		//System.out.println("Fibonacci series are:");
		//System.out.println(num1);
		//System.out.println(num2);;
		
		System.out.print(num1+""+num2);
		int fib=0;
		for(int i=1; i<=10; i++)
		{
			fib=num1+num2;
			System.out.println(fib);
			num1=num2;
			num2=fib;
		}
		
	
	}

}
