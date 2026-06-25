package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnameexample111 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		WebElement e1=d.findElement(By.tagName("textarea"));
		Thread.sleep(3000);
		e1.sendKeys("grotechminds"+Keys.ENTER);
        Thread.sleep(3000);
        d.close();

	}

}
