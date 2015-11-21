package com.orangehrm.testsuite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		String runmode=eo.getCellData(path2,0, 2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Add Employee skipped");
		}
		else
		{
			AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
			int rowCount=eo.getRowCount(path1,0);
			for(int i=1;i<rowCount;i++)
			{
				Thread.sleep(7000);
				aep.menu.pim();
				Thread.sleep(10000);
			
			aep.addEmployee(eo.getRow(path1, 0,i));
			}
		}
	}

}
