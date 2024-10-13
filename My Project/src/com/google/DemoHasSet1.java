package com.google;

import java.util.HashSet;

public class DemoHasSet1
{
public static void main(String[] args)
{
	HashSet<String> hs1=new HashSet<String>();
	hs1.add("Chainai");
	hs1.add("Mumbai");
	hs1.add("Banglore");
	hs1.add("Pune");
	System.out.println(hs1);
	HashSet<String> hs2=new HashSet<String>();
	hs2.add("green");
	hs2.add("red");
	hs2.add("blue");
	hs2.add("green");
	System.out.println(hs2);
	hs1.addAll(hs2);
	System.out.println(hs1);
	System.out.println(hs1.containsAll(hs2));
	System.out.println(hs2.contains("blue"));
	System.out.println(hs2.contains("black"));
	System.out.println("hs1 size="+hs1.size());
	System.out.println("hs2 size="+hs2.size());
	hs1.removeAll(hs2);
	System.out.println(hs1);
	hs2.remove("blue");
	System.out.println(hs2);
	hs2.clear();
	System.out.println(hs2.isEmpty());
	System.out.println(hs1.isEmpty());
	
}
}
