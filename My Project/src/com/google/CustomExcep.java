package com.google;
import java.util.Scanner;
public class CustomExcep 
{
public void validateAge(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("Your age is blew 18 50 you are not eligible for voting");
	}
	else
	{
		System.out.println("Welcome you are eligible for voting");
	}
	
}
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the age");

int age=s.nextInt();
CustomExcep obj=new CustomExcep();
obj.validateAge(age);

System.out.println("Program completed");

}

}

