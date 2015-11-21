package day30;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginusingLog4j {
	private static Logger log=Logger.getLogger(GmailLoginusingLog4j.class);
	public static void main(String[] args) throws InterruptedException
	{
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Borwser launched");
		driver.get("http://gmail.com");
		log.info("Navigated to gmail");
		driver.findElement(By.id("Email")).sendKeys("gandham.saikrishna");
		log.info("Entered username");
		driver.findElement(By.id("next")).click();
		log.info("Clicked on next");
		Thread.sleep(500);
		driver.findElement(By.id("Passwd")).sendKeys("pass@123");
		log.info("Enterd password");
		driver.findElement(By.id("signIn")).click();
		log.info("Clicked on sigin button");
		
	}
}
