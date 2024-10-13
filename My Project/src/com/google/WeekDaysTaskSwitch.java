package com.google;
import java.util.Scanner;
public class WeekDaysTaskSwitch 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day name");
		String day=s.nextLine();
		day=day.toLowerCase();
		switch(day)
		{
		case "monday":System.out.println("Monday task running");
		break;
		case "tuesday":System.out.println("Tuesday task running");
		break;
		case "wednesday":System.out.println("Wednesday task running");
		break;
		case "thursday":System.out.println("Thursday task running");
		break;
		case "friday":System.out.println("Friday task running");
		break;
		case "saturday":System.out.println("Saturday task running");
		break;
		case "sunday":System.out.println("Sunday task running");
		break;
		default:System.out.println("Please enter week days name");
		}
	}

}
