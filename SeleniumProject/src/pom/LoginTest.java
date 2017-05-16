package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends Constants
{
	@Test
	public void l()
	{
		driver.get(lp.url);
		driver.manage().window().maximize();
		
		lp.org_login(lp.u, lp.p);
		
		Sleeper.sleepTightInSeconds(3);
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
