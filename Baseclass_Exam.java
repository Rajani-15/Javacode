package exampractice.SeleniumExam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass_Exam 
{
	static WebDriver driver;
	@Parameters ("browser")
	@BeforeMethod
	public void launchBrowser(String name) throws InterruptedException
	{
		if(name.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(name.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(name.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	/*@AfterMethod
	public void quitbrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}*/
}
