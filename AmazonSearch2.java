package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.esotericsoftware.kryo.util.CuckooObjectMap.Keys;

public class AmazonSearch2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes"); 
		e1.click());
		//e1.sendKeys(Keys.ENTER);
		


	}

}
