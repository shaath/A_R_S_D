package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args)
	{
		//Launching Browser
		WebDriver driver=new FirefoxDriver();
		//Launch Gmail
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		//Identifying email textbox
		WebElement email=driver.findElement(By.id("Email"));

		//Entering text into textbox
		
		email.sendKeys("seleniumtrainer449");
//		Sleeper.sleepTightInSeconds(5);
		//Clear the text in email text box
//		email.clear();
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
		
		Sleeper.sleepTightInSeconds(10);
		
		//Enter The password into password field
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456987");
		//Click on signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
