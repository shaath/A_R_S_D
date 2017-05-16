package com.SeleniumProject.Javaprogrammes;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String course=sc.next();
		System.out.println(course);
		switch(course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "Manual":
			System.out.println("You are seelected Manual");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "LoadRunner":
			System.out.println("You are selected load Runner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
			
		}

	}

}
