package com.google;
 
import java.util.Scanner;
public class ArrayPractisTest
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array");
		int size=s.nextInt();
		int num[]=new int [size];
		System.out.println("Enter" +size+ "number in array");
		for(int i=0; i<num.length; i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println("Stored array value are:");
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
	}
}
