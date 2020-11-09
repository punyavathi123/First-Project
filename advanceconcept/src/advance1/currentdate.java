package advance1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class currentdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");  // hh:mm:ss a");
		Date date=new Date();
		Date date1= new Date();
		date1=dateformat.parse("29/02/2019");
		String sysdatentime=dateformat.format(date);
		String givendate=dateformat.format(date1);
		System.out.println(sysdatentime);
		System.out.println(givendate);
		//System.out.println(date);
	String str[]=sysdatentime.split("/");
	int cday=Integer.parseInt(str[0]);
	int cmonth=Integer.parseInt(str[1]);
	int cyear=Integer.parseInt(str[2]);
	
	String str1[]=givendate.split("/");
	int gday1=Integer.parseInt(str1[0]);
	int gmonth1=Integer.parseInt(str1[1]);
	int gyear1=Integer.parseInt(str1[2]);
	
	
	if(cyear<=gyear1)
	{
		
		if(cmonth<=gmonth1)
		{
			
		 if(cday<gday1)
			{
				System.out.println("valid date");
			}
		 else
		 {
			 System.out.println("Invalid date");
		 }
		}
		else 
		{
			System.out.println("Invalid date");
		}
		
	}
	else
	{
		System.out.println("invalid date");
	}
		
	

	}

}
