package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnametest112 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		WebElement e1=d.findElement(By.className("gLFyf"));
		Thread.sleep(7000);
		e1.sendKeys("tsla"+Keys.ENTER);
        Thread.sleep(3000);
        d.close();
	}

}
