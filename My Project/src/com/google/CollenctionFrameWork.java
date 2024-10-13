package com.google;

import java.util.ArrayList;
import java.util.HashSet;

public class CollenctionFrameWork 
{
public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add("jyoti");
	al.add(10);
	al.add('c');
	System.out.println(al);
	
	HashSet hs=new HashSet();
	hs.add("rahul");
	hs.add(20);
	hs.add(true);
	System.out.println(hs);
	
	al.addAll(hs);
	System.out.println(al);
	
}

}
