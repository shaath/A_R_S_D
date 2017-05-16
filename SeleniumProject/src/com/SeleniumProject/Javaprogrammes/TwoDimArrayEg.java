package com.SeleniumProject.Javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];
		
		//Finding the length of the rows
		System.out.println(x.length);
		
		//Finding the columns length
		
		System.out.println(x[0].length);
		
		//writing the data into an array
		
		x[0][1]="Selenium";
		
		x[1][0]="UFT";
		
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++) 
			{
				System.out.println(x[i][j]);
				
			}
		}
		

	}

}
