package com.orangehrm.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshots;

public class Constants {
	
	static RemoteWebDriver driver=null;
	String path1="E:\\Sep21Batch\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\EmployeeList.xlsx";
	ExcelOperations eo=new ExcelOperations();
	Screenshots sc=new Screenshots();
	String path2="E:\\Sep21Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	
}
