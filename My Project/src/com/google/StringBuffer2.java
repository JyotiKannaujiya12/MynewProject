package com.google;

public class StringBuffer2 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		
		sb.append("Lucknow");
		for(int i=0;i<sb.length();i++)
		System.out.println(sb.charAt(i));
		
	}

}
