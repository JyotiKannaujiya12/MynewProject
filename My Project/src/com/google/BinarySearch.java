package com.google;

public class BinarySearch 
{

	public static void main(String[] args) 
	
	{
		int arr[]= {2,4,5,7,8,9,12,14,20,24,30,40};
		int srch=14;
		int first=0;
		int last=arr.length-1;
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]==srch) 
			{
				System.out.println("element is at " +mid+ "index position");
				break;
			}
			else if (arr[mid]<srch)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
				mid=(first+last)/2;
			}
			if(first>last)
			{
				System.out.println("element not found");
			}
		}
	}

