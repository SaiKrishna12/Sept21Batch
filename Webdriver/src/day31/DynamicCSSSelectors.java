package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCSSSelectors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8090/orangehrm");
		driver.findElement(By.cssSelector("input[id$='sername']")).sendKeys("Admin");
		
	}

}
