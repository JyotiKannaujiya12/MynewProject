package com.google;

//import java.util.Scanner;
public class FactorialNum 
{
	public static void main(String[] args) 
	{
		int fact=1;
		int num=4;
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter the number:");
		//int num=s.nextInt();
		//if(num<0)
		//{
		//	System.out.println("factorial num dose not exit negative number");
		//}
		//else
		//{
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial " +num+ " is= " +fact);
		}
	}


