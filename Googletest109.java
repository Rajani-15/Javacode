package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletest109 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
		WebElement e1=d.findElement(By.linkText("About"));
		System.out.println(e1.getText());
		
		WebElement e2=d.findElement(By.linkText("Store"));
		System.out.println(e2.getText());
		
		WebElement e3=d.findElement(By.linkText("Gmail"));
		System.out.println(e3.getText());
		
		WebElement e4=d.findElement(By.linkText("Images"));
		System.out.println(e4.getText());
		e4.click();
		Thread.sleep(3000);
		d.quit();
	}

}
