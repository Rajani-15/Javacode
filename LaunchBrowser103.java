package SeleniumExample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser103 {

	public static void main(String[] args)
	{
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.google.com");
		FirefoxDriver f=new FirefoxDriver();
		f.get("https://www.google.com");
		InternetExplorerDriver e=new InternetExplorerDriver();
		e.get("https://www.google.com");
		
	}

}
