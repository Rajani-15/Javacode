package exampractice.SeleniumExam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_shoesTest extends Baseclass_Exam
{
	@Test
	public static void loginmethod() throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement e1=driver.findElement(By.id("ap_email_login"));
		e1.sendKeys("9765838149");
		
		WebElement e2=driver.findElement(By.className("a-button-input"));
		e2.click();
		Thread.sleep(3000);
		
		
		WebElement e3=driver.findElement(By.id("ap_password"));
		e3.sendKeys("Shrija@1515");
		
		WebElement e4=driver.findElement(By.id("auth-signin-button"));
		e4.click();
		
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

		WebElement searchbar=driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("shoes");
        Thread.sleep(3000);   
        
        List<WebElement> autosugg=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
        autosugg.get(0).click();
        
      
        WebElement sortitem=driver.findElement(By.id("s-result-sort-select"));
        wait.until(ExpectedConditions.visibilityOf(sortitem));
        Select s1=new Select(sortitem);
        s1.selectByIndex(1);
        
	}
}
