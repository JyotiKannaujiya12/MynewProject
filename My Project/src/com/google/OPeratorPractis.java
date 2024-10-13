package com.google;

public class OPeratorPractis 
{
public static void main(String[] args) 
{
	String revstr=" ";
	String s1="jyoti vijay";
	String  s2[]=s1.split(" ");
	 for(int i=s2.length-1;i>=0;i--)
	 {
	 revstr=revstr+s2[i]+" ";
	 }
	
	System.out.println("reverse string="+revstr);
}
}
