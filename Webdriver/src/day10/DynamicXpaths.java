package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpaths {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_144410')]/div/ol/li[6]/a")).click();

	}

}
