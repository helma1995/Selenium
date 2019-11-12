package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleDemo {
	WebDriver driver;
	String ExpectedResult="selenium - Google Search";
  @Test
  public void f() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A08019DIRP_c2c.02.02\\Documents\\Driver\\chromedriver.exe");		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\A08019DIRP_c2c.02.02\\Documents\\Driver\\chromedriver.exe");		
		//driver=new FirefoxDriver();
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).submit();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleContains(ExpectedResult));
		Assert.assertEquals(ExpectedResult, driver.getTitle());
	
		
	  
  }
}
