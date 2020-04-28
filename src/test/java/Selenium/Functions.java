package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class Functions {
	
	
	public static WebDriver driver;
	
	
	
	public static void TakeScreesnShot()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	Actions act=new Actions(driver);
		WebElement Search=driver.findElement(By.xpath("//*[@title='Search']"));
	act.moveToElement(Search).click()
	.keyDown(Search,Keys.LEFT_SHIFT)
	.sendKeys(Search,"lord venkateshwara")
	.keyUp(Search, Keys.LEFT_SHIFT).perform();
	
	Search.sendKeys(Keys.ENTER);	
		
		
		
	}
	


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		TakeScreesnShot();
	}

}
