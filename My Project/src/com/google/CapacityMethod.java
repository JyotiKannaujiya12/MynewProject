package com.google;

public class CapacityMethod
{

	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder(); 
		System.out.println(sb.capacity());
		sb.append("ABcdefghijklmnop");
		System.out.println(sb.capacity());
		
	}
}
