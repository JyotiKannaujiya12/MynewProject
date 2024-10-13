package com.google;
import java.util.Scanner;

public class IfElseIfStatement
{
public static void main(String[] args) 
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the First number");
	int n1=s.nextInt();
	System.out.println("Enter the secount number");
	int n2=s.nextInt();
	System.out.println("Enter the third number");
	int n3=s.nextInt();
	System.out.println("Enter the fourth number");
	int n4=s.nextInt();
	if(n1>n2 && n1>n3 && n1>n4)
	{
		System.out.println(n1+"is largest number");
	}
	else if(n2<n1 && n2>n3 && n2>n4)
	{
		System.out.println(n2+"is largest number");
	}
	else if(n3>n1 && n3>n2 && n3>n4)
	{
		System.out.println(n3+"is largest number");
	}
	else 
	{
		System.out.println(n4 + "is largest");
	}
}
}
