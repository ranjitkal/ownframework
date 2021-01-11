package Interview;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class TestMyntr {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/demo/exe/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement men=driver.findElement(By.xpath(("//nav[@class=\"desktop-navbar\"]//div[@class=\"desktop-navLinks\"]//div[@class=\"desktop-navContent\"]//div//a[text()='Men']")));
		Thread.sleep(5000);
		action.moveToElement(men).moveToElement(driver.findElement(By.xpath("//ul[@class=\"desktop-navBlock\"]//li//a[text()='Phone Cases']"))).click().build().perform();
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=\"search-searchProductsContainer row-base\"]//section//ul[@class=\"results-base\"]//li[11]")).click();
		 Set<String> ids = driver.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        driver.switchTo().window(childId);
	        String TxtBoxContent = driver.findElement(By.xpath("//strong[contains(text(),'Rs')]")).getText();
	        System.out.println(TxtBoxContent);
	        String Price = TxtBoxContent.replaceAll("\\D+","");
	        	
	        try {
	        	
	        }catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        int mainprice=Integer.parseInt(Price);
	       
	        if(mainprice<10)
	        {
	        	
	        	System.out.println("lay swast ahe  nakooooo");
	        }else
	        {
	       	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")).click();
	        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]"))).isEnabled();
	        }
		
	}

}
