package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatadrivenTesting3 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
	}
	
	@Test
	public void linksTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\Sep21Batch\\Webdriver\\src\\com\\qedge\\excelfiles\\registration.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		Row loc=row.next();
		while(row.hasNext())
		{
			Row r=row.next();
			int colnum=r.getLastCellNum();
			System.out.println(colnum);
			for(int j=0;j<colnum-1;j++)
			{
				driver.findElement(By.name(loc.getCell(j).getStringCellValue())).sendKeys(r.getCell(j).getStringCellValue());
			}
			driver.findElement(By.name("register")).click();
			String x=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			if(x.contains(r.getCell(9).getStringCellValue()))
			{
				r.createCell(12).setCellValue("Passed");
			}
			else
			{
				r.createCell(12).setCellValue("Failed");
			}
			driver.navigate().back();
			
		}
		FileOutputStream f1=new FileOutputStream("E:\\Sep21Batch\\Webdriver\\src\\com\\qedge\\resultexcelfiles\\registration.xlsx");
		wb.write(f1);
		f1.close();
	}		
			

}
