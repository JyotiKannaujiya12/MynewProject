package com.google;
import java.util.Scanner;
public class CountVowelConso 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=s.nextLine();
	s1=s1.toLowerCase();
	int vcount=0, ccount=0;
	for(int i=0; i<s1.length(); i++)
	{
		char c=s1.charAt(i);
		if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u')
		{
			vcount++;
		}
		if(c>='a' && c<='z')
		{
			ccount++;
		}
	}
	System.out.println("Vowel count= " +vcount);
	System.out.println("Consonent count=" +ccount);
	
		
			
}
}
