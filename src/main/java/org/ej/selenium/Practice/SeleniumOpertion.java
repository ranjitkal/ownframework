package org.ej.selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOpertion {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","src/main/java/com/demo/exe/chromedriver1.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver = null;
		driver=new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(driver,20);
		
		
		driver.get("https://classic.crmpro.com/");
		String ActaulUrl=driver.getCurrentUrl();
		
		String ExceptedUrl=("https://classic.crmpro.com/");
		System.out.println(ActaulUrl);
		System.out.println(ExceptedUrl);
		if(ActaulUrl.equals(ExceptedUrl))
		{
			driver.findElement(By.name("username")).sendKeys("ranjitk");
			driver.findElement(By.name("password")).sendKeys("Ranjit7001");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
		}else {
			System.out.println("url wrong");
		}
		//wait.until(ExpectedConditions.titleIs("CRMPRO  - CRM software for customer relationship management, sales, and support."));
		
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.findElement(By.id(""));
//		driver.findElement(By.className(""));
//		driver.findElement(By.linkText(""));
//		driver.findElement(By.partialLinkText(""));
//		driver.findElement(By.xpath(""));
		
		
		
		
	}

}
