package com.google;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3
{
public void readFile() throws IOException
{
	BufferedReader br=null;
	try
	{
		br=new BufferedReader(new FileReader("C:\\Users\\Sudhanshu\\Desktop\\PriyaPrograms\\My data\\input4.text"));
		int c;
		while((c=br.read())!=-1)
		{
			System.out.print((char)c);
		}
	}
	finally
	{
		if(br!=null)
		{
			br.close();
		}
	}
}
public static void main(String[] args)
{
	ReadFile3 obj=new ReadFile3();
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
