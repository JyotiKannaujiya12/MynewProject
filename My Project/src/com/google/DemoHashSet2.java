package com.google;

import java.util.HashSet;

public class DemoHashSet2 
{

	public static void main(String[] args)
	{
		HashSet hs1=new HashSet();
		Integer n1=500;
		hs1.add(n1);
		Character c1='D';
		hs1.add(c1);
		Float  k=0.8181f;
		hs1.add(k);
		
		Boolean b1=false;
		hs1.add(b1);
		hs1.add("Delhi");
		System.out.println(hs1);
		
		HashSet hs2=new HashSet();
		Integer n2=1200;
		hs2.add(n2);
		
		Character c2='E';
		hs2.add(c2);
		
		Double d1=0.7675;
		hs2.add(d1);
		Boolean b2=true;
		hs2.add(b2);
		hs2.add("Yellow");
		System.out.println(hs2);
		
		hs2.addAll(hs1);
		System.out.println(hs2);
		System.out.println(hs1.contains("Delhi"));
		System.out.println(hs1.contains("pune"));
		System.out.println(hs2.containsAll(hs1));
		System.out.println("hs1 size="+hs1.size());
		System.out.println("hs2 size="+hs2.size());
		
		hs2.removeAll(hs1);
		System.out.println(hs2);
		hs2.remove("yellow");
		System.out.println(hs2);
		System.out.println(hs1.equals(hs2));
		hs1.clear();
		System.out.println(hs1);
		System.out.println(hs1.isEmpty());
		System.out.println(hs2.isEmpty());
	}
}
