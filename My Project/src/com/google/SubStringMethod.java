package com.google;

public class SubStringMethod 
{

	public static void main(String[] args)
	{
		StringBuilder sb=new  StringBuilder();
		sb.append("ABCD");
		String s1=sb.substring(0,2);
		System.out.println(s1);
		String s2=sb.substring(1);
		System.out.println(s2);
		
	}
}
