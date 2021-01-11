package org.ej.selenium.Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {

    public static void main(String[] args) throws InterruptedException{
	System.out.println("hii 1");
    System.setProperty("webdriver.chrome.driver","E:\\ATESTING\\AUTOMATION\\NewWorkspace\\Practice\\src\\main\\java\\com\\demo\\exe\\chromedriver1.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    String url="https://www.softwaretestingmaterial.com/";
    driver.get(url);
    driver.manage().window().maximize();
    System.out.println("hii 2");
   // driver.close();    
	
          }
}