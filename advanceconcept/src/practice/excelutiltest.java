package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelutiltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		xlsx_reader ex=new xlsx_reader("data.xlsx");
		String sheetname="sheet1";
         String data=ex.getCellData(sheetname,0,2);
         System.out.println(data);
         int rowcount=ex.getRowCount(sheetname);
         int colcount=ex.getColumnCount(sheetname);
         System.out.println(rowcount);
         System.out.println(colcount);
         ArrayList<Object[]> mydata=new ArrayList<Object[]>();
         
		
         

 		for(int i=1;i<=rowcount;i++)
 		{
 			for(int j=0;j<colcount;j++)
 			{
 				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 				WebDriver driver=new ChromeDriver();
 				String url="https://www.mycontactform.com/";
 				driver.get(url);
 				driver.manage().window().maximize();
 				
 				
 				String user=ex.getCellData(sheetname,j,i);
 				
 				j++;
 				String pass=ex.getCellData(sheetname,j,i);
 				
 				
 				WebElement user1=driver.findElement(By.xpath("//*[@id=\'user\']"));
 				WebElement pass1=driver.findElement(By.xpath("//*[@id=\'pass\']"));
 				WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\'right_col_top\']/form/div/input"));
 				
 				user1.sendKeys(user);
 				pass1.sendKeys(pass);
 				loginbutton.click();
 				driver.close();
 			}
 		}
			}

}
