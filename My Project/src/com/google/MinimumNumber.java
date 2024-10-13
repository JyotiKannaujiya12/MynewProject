package com.google;

public class MinimumNumber 
{
public static void main(String[] args)
{
	int a[]= {7,2,1,4,5,6};
	int min=a[0];
	for(int i=1; i<a.length;i++)
	{
		if(min>a[i])
		{
			min=a[i];
		}
		
	}
	System.out.println("Minimum Element="+min);
}
}
