package com.google;
//import java.util.Scanner;

public class ArmStrongNum 
{
	public static void main(String[] args) 
	{
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=s.nextInt();
		
		int num=153;
		int num2=num;
		int num3=num;
		 int count=0,num4=0,rem;
		 while(num!=0)
		 {
			 count++;
			 num=num/10;
		 }
		 while(num2!=0)
		 {
			 rem=num2%10;
			 num4=(int)(num4+Math.pow(rem,count));
			 num2=num2/10;
		 }
		 if(num3==num4)
		 {
			 System.out.println(num3+ " is a armstrong number");
			 
		 }
		 else
		 {
			 System.out.println(num3+ " is a not armstrong number");
		 }
		
	}

}
