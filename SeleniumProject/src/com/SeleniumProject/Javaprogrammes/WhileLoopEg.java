package com.SeleniumProject.Javaprogrammes;

public class WhileLoopEg {

	public static void main(String[] args) 
	{
		int i=1;
		
		while(i<=100)
		{
			System.out.println(i);
			if (i==75)
			{
				break;
			}
			i=i+1;
			
		}

	}

}
