package SeleniumExample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermethod106 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		String pagetitle=driver.getTitle();
		System.out.println("Page Title="+pagetitle);
		String url=driver.getCurrentUrl();
		System.out.println("URL="+url);
		
		driver.quit();
		
	}

}
