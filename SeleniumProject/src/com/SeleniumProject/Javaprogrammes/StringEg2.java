package com.SeleniumProject.Javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String course="Selenium";// muineleS
		String c="selenium";
		
//		int len=course.length();
//		
//		for (int i = 0; i < len; i++)
//		{
//			System.out.println(course.charAt(i));
//		}
//				
//	
//		
//		for (int j = len-1; j >= 0; j--) 
//		{
//			System.out.print(course.charAt(j));
//		}

		if (course.contains("nel"))
		{
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are not same");
		}
	}

}
