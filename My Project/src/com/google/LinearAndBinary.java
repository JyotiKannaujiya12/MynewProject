package com.google;

public class LinearAndBinary
{
public static void main(String[] args)
{
	int arr[]= {10,20,30,40,50,60};
	int srch=30;
	int first=0;
	int last=arr.length-1;
	int mid=(first+last)/2;
	while(first!=last)
	{
		if(arr[mid]==srch)
		{
			System.out.println("element is at position "+mid+ " index position");
			break;
		}
		else if(arr[mid]<srch)
		{
		first=first+1;
		}
		else
		{
	
	last=last-1;
	
}
mid=(first+last)/2;
		}
		if(first>last)
		{
			System.out.println("element not found");
		}

}
}