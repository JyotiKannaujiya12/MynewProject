package com.google;

public class DuplicateElement
{
public static void main(String[] args)
{
	int a[]= {2,4,5,3,2,3,1};
	System.out.println("Duplicate Element are:");
	for(int i=0;i<a.length-1; i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if((a[i]==a[j])&&(i!=j))
					{
				System.out.println(a[j]+"");
					}
		}
	}
}
}
