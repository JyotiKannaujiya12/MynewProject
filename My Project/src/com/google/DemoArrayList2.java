package com.google;

import java.util.ArrayList;

public class DemoArrayList2 
{
public static void main(String[] args)
{
	ArrayList al1=new ArrayList();
	Integer n1=100;
	al1.add(n1);
	Character c1='A';
	al1.add(c1);
	Double d1=0.01175;
	al1.add(d1);
	Boolean b1=false;
	al1.add(b1);
	al1.add("Lucknow");
	System.out.println(al1);
	
	ArrayList al2=new ArrayList();
	Long l1=1120094l;
	al2.add(l1);
	Character c2='B';
	al2.add(c2);
	Float f1=0.01586f;
	al2.add(f1);
	Boolean b2=true;
	al2.add(b2);
	al2.add("red");
	System.out.println(al2);
	
	al1.addAll(al2);
	System.out.println(al1);
	System.out.println(al1.containsAll(al2));
	System.out.println(al1.contains("red"));
	System.out.println(al1.contains("kanpur"));
	
	System.out.println("al1 size="+al1.size());
	System.out.println("al2.size="+al2.size());
	al1.removeAll(al2);
	System.out.println(al1);
	al2.remove("red");
	System.out.println(al2);
	System.out.println(al1.equals(al2));
	al1.clear();
	System.out.println(al1);
	System.out.println(al1.isEmpty());
	System.out.println(al2.isEmpty());
	
}
}
