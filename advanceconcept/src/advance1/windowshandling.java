package advance1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.leafground.com/pages/Window.html";
		driver.get(url);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		String oldwin=driver.getWindowHandle();
		
		List<WebElement> links=driver.findElements(By.tagName("button"));
		
		String[] st=new String[links.size()];
		
//		for(int i=0;i<links.size();i++)
//		{
//			st[i]=links.get(i).getText();
//			System.out.println(st[i]);
//			
//		}
		
		
	     driver.findElement(By.xpath("//*[@id=\'home\']")).click();
	     driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
	     driver.findElement(By.xpath("//*[@id=\'color\']")).click();
		 driver.findElement(By.xpath("//*[@id=\"color\"]")).click();
//		for(int i=0;i<links.size();i++)
//		{
//			String s=st[i];
//			driver.findElement(By.linkText(s)).click();
//		 
		Set<String> newwin=driver.getWindowHandles();

		for (String string : newwin) {
			if(!string.equals(oldwin))
			{
				driver.switchTo().window(string);
				driver.close();
			}
	
		}
		driver.switchTo().window(oldwin);
			

		
		
	}

}
