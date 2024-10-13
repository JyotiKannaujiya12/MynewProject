package com.google;

public class CapacityBuffer
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("ABcdefghijklmnopq");
		System.out.println(sb.capacity());
	}

}
