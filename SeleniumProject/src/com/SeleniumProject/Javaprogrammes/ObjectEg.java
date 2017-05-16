package com.SeleniumProject.Javaprogrammes;

public class ObjectEg {

	public static void main(String[] args)
	{
		Object[] s={30000,"Selenium",'M',4444.44,true};
		
		System.out.println(s.length);
		
		for (Object object : s) 
		{
			System.out.println(object);
		}

	}

}
