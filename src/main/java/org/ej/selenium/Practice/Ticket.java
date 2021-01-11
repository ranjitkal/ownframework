package org.ej.selenium.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ticket {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/demo/exe/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		String url="https://www.spicejet.com/";
		driver.get(url);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Select fromto=new Select(driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")));
		fromto.deselectByVisibleText("Shirdi (SAG)");
		
		
	}
}
