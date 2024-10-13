package com.google;

public class DemoDuplicate 
{
	public static void main(String[] args)
	{
		int a[]= {3,2,5,6,7,3,1};
	
		System.out.println("Duplicate value are:");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((a[i]==a[j]&&(i !=j)))
				{
					System.out.println(a[j]+"");
				}
			}
		}
	}
}
