package com.SeleniumProject.Javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[5];
		
		System.out.println(x.length);
		
		//Write the data into an array
		x[2]="Selenium";
		x[0]="QEdge";
		x[2]="Sharath";
//		x[5]="UFT";
		
		System.out.println(x.length);
		
		//Reading the data from array
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		
		
	}

}
