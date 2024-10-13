package com.google;

import java.util.Scanner;
public class ReverseString
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		System.out.println("Enter the string");
		sb.append(s.nextLine());
		System.out.println("Reverse string="+sb.reverse());
		
		
	}
}
