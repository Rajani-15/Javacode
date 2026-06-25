package SeleniumExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		String str=driver.getTitle();
		System.out.println(str);
		String str1=driver.getCurrentUrl();
		System.out.println(str1);
		Thread.sleep(2000);
		
		


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
	//	e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
				


