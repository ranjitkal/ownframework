package StepDefination;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step {
	
	WebDriver driver;
	
	@Given ("^Open the Chrome and launch the application$")	
	public void open_lunch()throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","E:\\ATESTING\\AUTOMATION\\NewWorkspace\\Practice\\src\\main\\java\\com\\demo\\exe\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String url="https://classic.crmpro.com/";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("luch application and browser open sucessfully");
	}
	
	@When ("^Enter the \"(.*)\" and  \"(.*)\" $")
	public void enter_uname(String uname, String pass)throws Throwable
	{
		driver.findElement(By.name("username")).sendKeys("uname");
		driver.findElement(By.name("password")).sendKeys("pass");
	}
	
	@Then ("^click login button$")

	public void click()
	{
		driver.findElement(By.xpath("//*[@class='btn btn-small']")).click();
      System.out.println("click login buttonm");

}
@Then ("^check the login sucessfully or not$")
  public void validate()
  {
	String ExpectedUrl="https://classic.freecrm.com/index.cfm?CFID=1493519&CFTOKEN=23116106&jsessionid=48308055c8d245758c6a19135d3a3f515b41";
	String ActualUrl=driver.getCurrentUrl();
	System.out.println(ActualUrl);
	Assert.assertEquals(ExpectedUrl,ActualUrl);
  }


}

/*


feature

Feature: Reset functionality on login page of Application 
Scenario Outline: Verification of Reset button 
Given Open the Chrome and launch the application			
When Enter the Username <user> and Password	 <pass>		
Then Reset the credential
Examples:

 |user | pass |
 | ranjitk | Ranjit7001 |
 | radk    | Ranjit7001 |
 | ranjitk  | pqrs |
 
@Given ("^Open the Chrome and launch the application$")	
public void open_lunch()
{
	System.setProperty("webdriver.chrome.driver","E:\\ATESTING\\AUTOMATION\\NewWorkspace\\Practice\\src\\main\\java\\com\\demo\\exe\\chromedriver1.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	String url="https://classic.crmpro.com/";
	driver.get(url);
	driver.manage().window().maximize();
	System.out.println("luch application and browser open sucessfully");
}

@When ("^Enter the Username \"(.*)\" and Password \"(.*)\" $")
public void enter_uname(String user , String pass)
{
	driver.findElement(By.name("username")).sendKeys("user");
	driver.findElement(By.name("password")).sendKeys("pass");
}
@Then ("^Reset the credential$")

public void click()
{
	driver.findElement(By.xpath("//*[@class='btn btn-small']")).click();
  System.out.println("click login buttonm");

}
}
	
	*/