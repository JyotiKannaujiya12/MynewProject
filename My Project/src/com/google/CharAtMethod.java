package com.google;

public class CharAtMethod 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		sb.append("ABCD");
		for(int i=0; i<sb.length(); i++)
		{
			System.out.println(sb.charAt(i));
		}
	}

}
