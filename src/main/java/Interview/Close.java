package Interview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "src/main/java/com/demo/exe/chromedriver3.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String Parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!Parent.equals(childWindow))
			{
				
				System.out.println(driver.switchTo().window(childWindow).getTitle());
				driver.close();
				
			}
		}
		
		driver.switchTo().window(Parent);
		
		
		
	}

}
