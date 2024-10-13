package com.google;

import java.util.Scanner;

public class DemoAppendUser 
{
public static void main(String[] args)
{


	StringBuilder sb=new StringBuilder();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name:");
    sb.append(s.nextLine());
	System.out.println("Enter the age:");
	sb.append(s.nextInt());
	System.out.println(sb);
	
}
}