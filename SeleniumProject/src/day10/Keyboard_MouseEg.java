package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Keyboard_MouseEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");

		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions act=new Actions(driver);
		
		//Focusing on gmail
		act.moveToElement(gmail).build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Right Click on Gmail
		
		act.contextClick().build().perform();
		
		Sleeper.sleepTightInSeconds(5);
		//Press down arrow key 3 times
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Sleeper.sleepTightInSeconds(5);
		//Press on enter 
		act.sendKeys(Keys.ENTER).build().perform();
	}

}
