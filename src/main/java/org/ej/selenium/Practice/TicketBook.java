package org.ej.selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBook {
	public static void main(String[] args) {
		System.out.println("Ticket Booking");
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/demo/exe/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.spicejet.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).sendKeys("pu");
		driver.findElement(By.linkText("Pune (PNQ)")).click();
		driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_destinationStation1\"]")).sendKeys("go");
		driver.findElement(By.linkText("Goa (GOI)")).click();
		
		
		
		
		
	}

}
