package com.google;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile 
{
public void readFile()throws IOException
{
	FileInputStream fin=null;
			try
	{
				fin=new FileInputStream("C:\\Users\\Sudhanshu\\Desktop\\PriyaPrograms\\My data\\MyData.txt");
			int c;
			while((c=fin.read())!=-1)
			{
				System.out.print((char)c);
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
public static void main(String[]args)
{
	ReadFile r=new ReadFile();
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
