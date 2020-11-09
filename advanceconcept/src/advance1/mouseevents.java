package advance1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseevents {
	  public static void main(String[] args) {
	       // String baseUrl = "http://demo.guru99.com/";
	        
		  String baseUrl="https://www.softwaretestingmaterial.com/";
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Naresh\\Downloads\\chromedriver.exe");
	                WebDriver driver = new ChromeDriver();

	                driver.get(baseUrl); 
	                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	                
	                WebElement link_Home = driver.findElement(By.xpath("//*[@id=\'menu-item-4358\']/a/span"));
	                WebElement td_Home = driver.findElement(By.xpath("//*[@id=\'menu-item-4350\']/a/span")); 
	                WebElement tr_Home=driver.findElement(By.xpath("//*[@id=\'menu-item-4350\']/ul/li[3]/a/span"));
	                	
	                Actions actions = new Actions(driver);
		               actions.moveToElement(link_Home).moveToElement(td_Home).moveToElement(tr_Home).click().build().perform();

	               
	             
	                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	                driver.close();
	        }

}
