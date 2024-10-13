package com.google;
import java.util.Scanner;
public class NestedSwitch 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter option number");
	int opt1=s.nextInt();
	switch(opt1)
	{
	case 1:System.out.println("case 1 running");
	      System.out.println("Enter option number");
	      int opt2=s.nextInt();
	      switch(opt2)
	      {
	      case 10:System.out.println("case 10 running");
	      break;
	      case 11:System.out.println("case 11 running");
	      break;
	      default:System.out.println("default case running");
	      }
	      break;
	case 2:System.out.println("case 2 running");
           System.out.println("Enter option number");
            int opt3=s.nextInt();
      switch(opt3)
     {
    case 20:System.out.println("case 20 running");
    break;
    case 21:System.out.println("case 21 running");
    break;
    default:System.out.println("default case running");
    }
    break;
    
	      default:System.out.println("default case running");
	}
}
}
