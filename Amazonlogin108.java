package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlogin108 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("ap_email_login"));
		e1.sendKeys("9765838149");
		
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Shrija@1515");
		
		WebElement e4=driver.findElement(By.id("auth-signin-button"));
		e4.click();
		
		//driver.close();
	}

}
