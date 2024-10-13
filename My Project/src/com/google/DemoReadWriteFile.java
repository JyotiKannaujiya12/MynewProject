package com.google;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoReadWriteFile
{
public void readWriteFile() throws IOException
{
	FileInputStream fin=null;
	FileOutputStream fout=null;
	try
	{
		fin=new FileInputStream("C:\\Users\\Sudhanshu\\Desktop\\PriyaPrograms\\My data\\input10.text");
		fout=new FileOutputStream("C:\\\\Users\\\\Sudhanshu\\\\Desktop\\\\PriyaPrograms\\\\My data\\output11.text");
		int c;
		while((c=fin.read())!=-1)
		{
			System.out.print((char)c);
			fout.write(c);
		}
	}
	finally
	{
		if(fin!=null)
		{
			fin.close();
		}
		if(fout !=null)
		{
			fout.close();
		}
	}
}
public static void main(String[] args) 
{
	
	DemoReadWriteFile obj=new DemoReadWriteFile();
	try
	{
		obj.readWriteFile();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
