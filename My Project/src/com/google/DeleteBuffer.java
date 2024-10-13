package com.google;

public class DeleteBuffer 
{
public static void main(String[] args) 
{
	StringBuffer sb=new StringBuffer();
	sb.append("Jyotikannaujiya");
	sb.delete(1,5);
	sb.delete(2, 12);
	System.out.println(sb);

}
}
