package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AdvancedOpsEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.id("txtUsername"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(user).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		user.click();
		
		user.sendKeys("Admin");
		
		Sleeper.sleepTightInSeconds(5);
		
		act.doubleClick().build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		act.contextClick().build().perform();
		Sleeper.sleepTightInSeconds(5);

		
		act.sendKeys(Keys.chord("D")).build().perform();
		
	}

}
