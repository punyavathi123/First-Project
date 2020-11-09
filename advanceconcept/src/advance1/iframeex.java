package advance1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeex {
	
	public static void main(String[] arg)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naresh\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.guru99.com/accessing-forms-in-webdriver.html";
		driver.get(url);
		driver.manage().window().maximize();
		List<WebElement> noofiframes=driver.findElements(By.tagName("iframe"));
		int size=noofiframes.size();
		System.out.println(size);
		//driver.switchTo().frame( );
		WebElement we=driver.findElement(By.id("google_ads_iframe_/24132379/Guru99.com_300x600_0"));
		String str=driver.switchTo().frame(we).getTitle();
		String[] str1=new String[size];
		
		System.out.println(str);
//		for(int i=0;i<=size;i++)
//		{
//		 str1[i]=driver.switchTo().frame(i).getTitle();
//		 
//			System.out.println(str1[i]);
//		}
	}

}
