package com.google;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicateEle 
{

		
//		int arr[]= {1,2,2,3,4,4,5,6,6,7};
//		int len=arr.length;
//		int temp[]=new int[arr.length];
//		int j=0;
//		for(int i=0;i<len-1;i++)
//		{
//			if(arr[i] !=arr[i+1])
//			{
//				temp[j++]=arr[i]; 
//			}
//		}
//		temp[j++]=arr[len-1];
//		for(int k=0;k<j;k++)
//		{
//		  System.out.println(temp[k]);
//		}
		
		public static void main(String[] args)
		{
		int []num= {1,2 ,3,3,4,4,5,5,6,6,7};
        System.out.println("Original Array values= "+Arrays.toString(num));
				
				
		int []removeDup=IntStream.of(num).distinct().toArray();
	   System.out.println("Array without Duplicate "+Arrays.toString(removeDup));
			}

		
		
	}

