package com.google;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile2
{
public void readFile()  throws IOException
{
	FileReader fr=null;
	try
	{
		fr=new FileReader("input.txt");
		int c;
		while((c=fr.read())!=-1)
		{ 
			System.out.print((char)c);
		}
	}
	finally
	{
		if(fr!=null)
		{
			fr.close();
		}
	}
}
public static void main(String[] args)
{
	ReadFile2 obj=new ReadFile2();
	try
	{
		obj.readFile();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
