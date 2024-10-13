package com.google;

public class ContinueKeyword 
{
public static void main(String[] args) 
{
	for(int i=1; i<=10; i++)
	{
		if(i==4 || i==7)
		{
			continue;
		}
		else
		{
			System.out.println(i);
		}
	}
}
}
