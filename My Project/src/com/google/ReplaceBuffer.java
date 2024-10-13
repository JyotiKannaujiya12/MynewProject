package com.google;

public class ReplaceBuffer
{
public static void main(String[] args)
{
	StringBuffer sb=new StringBuffer();
	sb.append("Channai");
	sb.replace(5, 7,"Delhi");
	System.out.println(sb);
}
}
