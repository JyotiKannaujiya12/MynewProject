package com.google;

public class DemoString {
	
	//reverse  Lucknow
	public static void main(String[] args) {
		String revers="";
		String s1="Lucknow";
		for(int i=s1.length()-1;i>=0;i--)
		{
			
			revers=revers+s1.charAt(i);
		}
		System.out.println("Revers string="+revers);
		
	
	
	String s2="Ballia";
	for(int j=0;j<s2.length();j++)
	{
		System.out.println("CharAt="+s2.charAt(j));
	}

}
}
