package TestQATools.MyFirstTestProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest1 {

	
	@Test
	public void Test1()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		  
        // Launching website
        driver.get("https://selenium-apps.doselect.in/change-text/");
      driver.findElement(By.id("bigger")).click();
      driver.findElement(By.id("smaller")).click();
      driver.findElement(By.id("reset")).click();
      driver.findElement(By.xpath("//a[@id='bigger']")).click();
      driver.findElement(By.xpath("//a[@id='smaller']")).click();
      driver.findElement(By.xpath("//a[@id='reset']")).click();    
        driver.close();
	}
	
	
	@Test
	public void Test2()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		  
        // Launching website
        driver.get("https://selenium-apps.doselect.in/age-calculator/");
        String dob1="01121998";
        String dob2="02262000";
        driver.findElement(By.id("birth_date")).sendKeys(dob1);
        driver.findElement(By.id("calculate")).click();
        driver.findElement(By.xpath("//input[@id='birth_date']")).sendKeys(dob2);
        driver.findElement(By.xpath("//div[@id='calculate']")).click();
        driver.close();

}
}
