package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScrollDown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/main/java/com/demo/exe/chromedriver1.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	

}
