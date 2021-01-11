package org.ej.selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchOpertion {
	
	public static void main(String[] args) {
		
		System.out.println("hii");
		System.setProperty("webdriver.chrome.driver","E:\\ATESTING\\AUTOMATION\\NewWorkspace\\Practice\\src\\main\\java\\com\\demo\\exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("ranjitkalgavkar@gmail.com");
	   //	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ranjitkalgavkar@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("prianu");
		
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		
		
		
		
		
	}

}
