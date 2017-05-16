package methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class methodsEg1 
{
	public static void main(String[] args)
	{
		int a=30;
		int b=40;
		function1();
		String res=function2();
		System.out.println(res);
		
		methodsEg1 m=new methodsEg1();
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
		
		int result=m.sum(a, b);
		System.out.println(result);
	}
	
	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static Method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Non static Methods without returning any value
	public void function3()
	{
		System.out.println("This is Function3");
	}
	
	//NonStatic Methods with returning value
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public void Takes_Screenshot(WebDriver driver, String Loc) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(Loc));		

	}

}
