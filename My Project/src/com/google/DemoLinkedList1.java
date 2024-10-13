package com.google;

import java.util.LinkedList;

public class DemoLinkedList1 
{
public static void main(String[] args)
{
	
	
	 LinkedList<String> al1=new LinkedList<String>();
	 al1.add("Lucknow");
	 al1.add("Pune");
	 al1.add("Kanpur");
	 al1.add("Mumbai");
	 System.out.println(al1);
	 for(String k: al1)
	 {
		 System.out.println(k);
	 }
	 LinkedList<String> al2=new LinkedList<String>();
	 al2.add("Blue");
	 al2.add("Red");
	 al2.add("Pink");
	 al2.add("Yellow");
	 System.out.println(al2);
	 al1.addAll(al2);
	 System.out.println(al1);
	 System.out.println(al2);
	 al2.add("blue");
	 System.out.println(al2);
	 System.out.println(al1.contains("Pink"));
	 System.out.println(al1.contains("black"));
	// boolean b=al1.contains("Blue");
	 //System.out.println(al1);
	 
	 System.out.println(al1.containsAll(al2));
	 System.out.println("al1 size=" +al1.size());
	 System.out.println("al2 size="+al2.size());
	 
	 System.out.println(al1.removeAll(al2));
	 System.out.println(al1);
	 al2.remove("Pink");
	 System.out.println(al2);
	 
	 System.out.println(al1.equals(al2));
	 al1.clear();
	 System.out.println(al1);
	 System.out.println(al1.isEmpty());
	 System.out.println(al2.isEmpty());


}
}
