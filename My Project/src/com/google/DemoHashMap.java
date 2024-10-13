package com.google;

import java.util.HashMap;

public class DemoHashMap 
{
public static void main(String[] args)
{
	HashMap<String,String>hm1=new HashMap<String,String>();
	hm1.put("1","Lucknow");
	hm1.put("2","Pune");
	hm1.put("3","Mumbai");
	hm1.put("4","Chanai");
	System.out.println(hm1);
	
	
	HashMap<String,String>hm2=new HashMap<String,String>();
	hm2.put("10","Yellow");
	hm2.put("12","Pink");
	hm2.put("13","Red");
	hm2.put("14","Blue");
	System.out.println(hm2);
	hm2.putAll(hm1);
	System.out.println(hm1);
	
	hm2.remove("12");
	System.out.println(hm2);
	System.out.println("hm1 size="+hm1.size());
	System.out.println(hm1.get("2"));
	
	System.out.println(hm1.containsKey("4"));
	System.out.println(hm2.containsValue("11"));
	
	System.out.println(hm1.equals(hm2));
	System.out.println(hm1.keySet());
	hm1.clear();
	System.out.println(hm1);
	System.out.println(hm1.isEmpty());
	System.out.println(hm2.isEmpty());
	
	
}
}
