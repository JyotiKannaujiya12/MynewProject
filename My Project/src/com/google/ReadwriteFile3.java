package com.google;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadwriteFile3
{
	public void readWriteFile() throws IOException
	{
		
		
		BufferedReader br=null;
         BufferedWriter bw=null;
		try
		{
			br=new BufferedReader(new FileReader("C:\\Users\\Sudhanshu\\Desktop\\PriyaPrograms\\My data\\input3.text"));
			bw=new BufferedWriter(new FileWriter("C:\\Users\\Sudhanshu\\Desktop\\PriyaPrograms\\My data\\output3.text"));
			int c;
			while((c=br.read())!=-1)
			{
				System.out.print((char)c);
				bw.write(c);
				
			}
		}
		finally
		{
			if(br!=null)
			{
				br.close();
			}
			if(bw!=null)
			{
				bw.close();
			}
		}
	}
	public static void main(String[] args) 
	{
		ReadwriteFile3 obj=new ReadwriteFile3 ();
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

