package com.google;
import java.util.Scanner;
public class Table5 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=s.nextInt();
	//int num=6;
	for(int i=1;i<=10; i++)
	{
		System.out.println( num+"x" +i+ "=" +num*i);
	}
}
}
