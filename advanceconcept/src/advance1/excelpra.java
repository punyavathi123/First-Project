package advance1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelpra {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Naresh\\Downloads\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          String baseUrl="https://ttdsevaonline.com/#/login";
          driver.get(baseUrl); 
          
        
          
          File file=new File("data1.xlsx");
          FileInputStream fis=new FileInputStream(file);
          
          XSSFWorkbook workbook= new XSSFWorkbook(fis);
          XSSFSheet sheet=workbook.getSheetAt(0);
          XSSFCell cell;
          XSSFRow row;
          
          int rowsize=sheet.getLastRowNum();
          row=sheet.getRow(rowsize);
          int colsize=row.getLastCellNum();
          System.out.println(rowsize );
          System.out.println(+colsize);
          
          String[][] str=new String[rowsize][colsize];
         
          for(int i=1;i<=rowsize;i++)
        	  
          {
        	  for(int j=0;j<colsize;j++)
        	  {
        		  
        	  str[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
        	  System.out.println(str[i-1][j]);
        	  }
        
          }
          		
	}

}
