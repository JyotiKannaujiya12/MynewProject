package com.google;


public class PracticeProgram
{
public static void main(String[] args) 
{

//Linear search
int arr[]= {3,5,7,1,4,6,2};
int srch=1;
int temp=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==srch)
	{
		System.out.println("element is at "+i+" index position");
	
	temp=temp+1;
	}
}
	if(temp==0)
	{

System.out.println("element not found it list");

	}
}
}

