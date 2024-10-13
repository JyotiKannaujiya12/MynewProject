package com.google;

import java.io.FileInputStream;
import java.io.IOException;

public class SinReadFile
{
public void readFile() throws IOException
{
	FileInputStream fin =null;
	try
	{
		fin= new FileInputStream("input.txt");
		int c;
		while((c=fin.read())!=-1)
		{
			System.out.println((char)c);
		}
	}
	finally
	{
		if(fin!=null)
		{
		fin.close();	
		}
	}
	
}
public static void main(String[] args) 
{
	SinReadFile r=new SinReadFile();
	try
	{
	r.readFile();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}

}
