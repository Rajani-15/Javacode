package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpartiallinktext110 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://amazon.in");
		
		WebElement e1=d.findElement(By.partialLinkText("Customer"));
		System.out.println("Link="+e1.getText());
		Thread.sleep(3000);
		e1.click();
		d.quit();
		
		
		
		
	}

}
