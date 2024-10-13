package com.google;

public class ArmstrongNum22 {

	public static void main(String[] args)
	{
		int num=153;
		int a,b=0,t;
		t=num;
		while(num>0)
		{
			a=num%10;
			b=b+a*a*a;
			num=num/10;
		
		}
		if(b==t)
		{
			System.out.println("armstrong no:"+b);
		}
		else
		{
			System.out.println("not an armstrong="+b);
		}
	}
}
