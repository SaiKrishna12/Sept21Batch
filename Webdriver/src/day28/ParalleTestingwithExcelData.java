package day28;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParalleTestingwithExcelData {
	@DataProvider(parallel=true)
	public Object[][] getData() throws IOException
	{
		FileInputStream f=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int r=ws.getLastRowNum();
		System.out.println(r);
		Row row=ws.getRow(0);
		int c=row.getLastCellNum();
		System.out.println(c);
		Object [][] data=new Object[r+1][c];
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				data[i][j]=ws.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	@Test(dataProvider="getData")
	public void loginTest(String u,String p, String b) throws MalformedURLException, InterruptedException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
				
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://yahoomail.com");
		Thread.sleep(6000);
		driver.findElement(By.name("username")).sendKeys(u);
		driver.findElement(By.id("login-passwd")).sendKeys(p);
		driver.findElement(By.id("login-signin")).click();
	}


}
