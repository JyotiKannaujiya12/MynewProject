package com.google;

public class StringLinearSer 
{
public static void main(String[] args)
{
	String  arr[]= {"Jyoti","Monika","Bandana","Rahul","Vijay","Ritesh"};
	String item="Rahul";
	int temp=0;
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i].equals(item))
		{
			System.out.println("item present in " +i+ "Index position");
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("item dose not present in this list");
	}
}
}
