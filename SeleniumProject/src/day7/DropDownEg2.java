package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("x")).click();

		WebElement f=driver.findElement(By.id("fromCity"));
		
		Select fDrop=new Select(f);
		
		List<WebElement> flist=fDrop.getOptions();
		System.out.println(flist.size());
		
		WebElement t=driver.findElement(By.id("toCity"));
		
		Select tDrop=new Select(t);
		
		for (int i = 0; i < flist.size(); i++)
		{
			fDrop.selectByIndex(i);
			String fCity=flist.get(i).getText();
			System.out.println(fCity);
			
			List<WebElement> tlist=tDrop.getOptions();
			for (int j = 0; j < tlist.size(); j++) 
			{
				tDrop.selectByIndex(j);
				String tCity=tlist.get(j).getText();
				
				if (fCity.equalsIgnoreCase(tCity))
				{
					flag=true;
					break;
				}
				
			}
			if (flag)
			{
				break;
			}
		}
		if (flag==true) 
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}

}
