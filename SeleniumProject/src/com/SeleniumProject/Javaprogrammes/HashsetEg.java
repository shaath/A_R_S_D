package com.SeleniumProject.Javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) 
	{
		Set<Object> x=new HashSet<Object>();
		
		//Writing the data int hashset
		x.add("Selenium");
		x.add("Apple");
		x.add(40000);
		x.add('M');
		x.add("Boll");
		x.add("Apple");
		
		Iterator<Object> it=x.iterator();
		
		while (it.hasNext()) 
		{
			Object data=it.next();
			System.out.println(data);
		}
		

	}

}
