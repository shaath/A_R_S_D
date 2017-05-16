package com.SeleniumProject.Javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		s.add("Selenium");
		s.add(400000);
		s.add('M');
		s.add(true);
		s.add("Selenium");
		s.add(2, "UFT");
		
		//Finding the length of the arraylist
		
		System.out.println(s.size());
		
		//Reading the data from arraylist
		
		for (int i = 0; i < s.size(); i++) 
		{
			System.out.println(s.get(i));
			
		}
		

	}

}
