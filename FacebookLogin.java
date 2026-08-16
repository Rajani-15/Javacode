package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		
			
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/help/ipreporting/report/copyright");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("rspatil15@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Viraj@1520");
		
		
		WebElement fblogin=driver.findElement(By.xpath("//span[text()='Log in']"));
		fblogin.click();
		
		
		

	}

}
