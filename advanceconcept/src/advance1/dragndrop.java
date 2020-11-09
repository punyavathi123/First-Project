package advance1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class dragndrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		
		//WebDriver driver1=new OperaDriver();
		WebElement from1=driver.findElement(By.xpath("//*[@id=\'credit2\']/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\'bank\']/li"));
		WebElement from2=driver.findElement(By.xpath("//*[@id=\'fourth\']/a"));
		WebElement to2=driver.findElement(By.xpath("//*[@id=\'amt7\']/li"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(from1, to1).build().perform();
		action.dragAndDrop(from2, to2).build().perform();
		
		
		WebElement from3=driver.findElement(By.xpath("//*[@id=\'credit1\']/a"));
		WebElement to3=driver.findElement(By.xpath("//*[@id=\'loan\']/li"));
		WebElement from4=driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement to4=driver.findElement(By.xpath("//*[@id=\'amt8\']/li"));
		
		action.dragAndDrop(from3, to3).build().perform();
		action.dragAndDrop(from4, to4).build().perform();
	
		
		

	}

}
