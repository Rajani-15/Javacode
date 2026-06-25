package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLExample113 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d=new ChromeDriver();
		d.get("file:///D:/Seleniumpractice/learningHTML1.html");
		Thread.sleep(3000);
		
		List<WebElement> l1=d.findElements(By.tagName("input"));
		int count=l1.size();
		
		System.out.println("Tagnames="+count);
		
		d.quit();
		
	}

}
