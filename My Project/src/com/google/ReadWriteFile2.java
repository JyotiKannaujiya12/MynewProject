package com.google;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile2 
{
public void readFile() throws IOException
{
	FileReader fr=null;
	FileWriter fw=null;
	try
	{
		fr=new FileReader("input.txt");
		fw=new FileWriter("output.txt");
		int c;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
			fw.write(c);
			
		}
	}
	finally
	{
		if(fr!=null)
		{
			fr.close();
		}
		if(fw!=null)
		{
			fw.close();
		}
	}
}
public static void main(String[] args) 
{
	ReadWriteFile2 obj=new ReadWriteFile2 ();
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
