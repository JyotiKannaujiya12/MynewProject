package com.google;
import java.util.Scanner;
public class SwitchCase
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the option number");
		int option =s.nextInt();
		switch(option)
		{
		case 1: System.out.println("case-1 running");
		break;
		case 2: System.out.println("case-2running");
		break;
		case 3: System.out.println("case-3 running");
		break;
		default: System.out.println("default case running");
		}
	}

}
