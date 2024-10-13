package com.google;

public class PatternJanA 
{
	public static void main(String[] args) 
	{
		
for(int i=1;i<=7;i++)
{
	for(int j=1;j<=9;j++)
	{
	if((j==6-i)||(i==3&&j>=3&&j<=7)||(j==4+i))
		System.out.print("*");
	else
	System.out.print(" ");
	}
   System.out.println();

}
//for(int i=1;i<=7;i++)
//{
//	for(int j=1;j<=7;j++)
//	{
//	if(i==1||j==4||i==j+3)
//		System.out.print("*");
//	else
//		System.out.print(" ");
//	}
//System.out.println();
//}
}	
}