package com.google;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInSet 
{
public static void main(String[] args) 
{
	int a[]= {2,4,5,3,2,1,3};
	Set<Integer> s=new HashSet<>();
	for(int num:a)
	
	{
		//boolean b=s.add(num);
		//if(b==false)
		if(s.add(num)==false)
		{
			System.out.println(num);
		}
	}
	
}
}
