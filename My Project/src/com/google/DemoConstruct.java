package com.google;

public class DemoConstruct 
{
public  DemoConstruct()
{
	System.out.println("default constructor running");
}

	public  DemoConstruct(String name)
	{
		this();
		System.out.println("Name="+name);
		System.out.println("parameterized constructor running");
	}
	public static void main(String[] args) 
	{
		DemoConstruct d1=new DemoConstruct ("XYZ");
		DemoConstruct d2=new DemoConstruct ("ABC");
	}

}
