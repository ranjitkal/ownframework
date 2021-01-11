package Interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSelection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/main/java/com/demo/exe/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		driver.manage().window().maximize();
		//driver.switchTo().frame("myframe");
		//driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
		//driver.switchTo().frame(By.xpath("//*[@id=\"google_ads_iframe_/1039154/Moneycontrol/MC_HP/MC_HP_Native_ATF_0\"]"));
		List column=driver.findElements(By.xpath("//*[@id=\"maNSE\"]/table/tbody/tr"));
		System.out.println("size coulumn"+""+column.size());
		List  col = driver.findElements(By.xpath(".//*[@id=\"market_action\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List  rows = driver.findElements(By.xpath(".//*[@id=\"market_action\"]/div[3]/div/div[1]/div/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());

		
	}

}
