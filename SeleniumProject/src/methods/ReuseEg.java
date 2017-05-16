package methods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReuseEg {

	public static void main(String[] args) throws IOException
	{
		methodsEg1 m=new methodsEg1();
//		
//		int res=m.sum(300, 200);
//		System.out.println(res);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		m.Takes_Screenshot(driver, "F:\\Dipal_Jyothi_MAla_Shradha\\SeleniumProject\\src\\Screenshots\\Faebook.bmp");
		

	}

}
