package com.google;

public class SubBuffer
{
public static void main(String[] args)
{
	StringBuffer sb=new StringBuffer();
	sb.append("Lucknow");
	String s1=sb.substring(0,4);
	System.out.println(s1);
	String s2=sb.substring(4);
	System.out.println(s2);
}
}
