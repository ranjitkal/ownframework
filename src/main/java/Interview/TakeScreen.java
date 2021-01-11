package Interview;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreen {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/demo/exe/chromedriver3.exe");
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		//String ExceptedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String ExceptedTitle="Online Shopping site iShoes and More - Amazon.in";

		if(ActualTitle.equals(ExceptedTitle))
		{
			System.out.println("sucessfully login ");
		}else
			
		{
			
			TakesScreenshot ts = (TakesScreenshot)driver;
            File file = ts.getScreenshotAs(OutputType.FILE);
           try {
        	   FileUtils.copyFile(file, new File("./Practice/ScreenShot/Failed.png"));
			//	FileUtils.copyFile(file, new File("D://Test1_Login.png"));
				System.out.println("login failed");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
		}	
	}

}
