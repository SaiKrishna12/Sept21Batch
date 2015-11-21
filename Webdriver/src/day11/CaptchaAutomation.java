package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptchaAutomation {

	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
		int i=1;
		while(i<10)
		{
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester1");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the captcha");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String [] a=x.split(" ");
			int y=Integer.parseInt(a[0]);
			int z=Integer.parseInt(a[2]);
			int k=y+z;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Thread.sleep(7000);
			//driver.findElement(By.name("op")).click();
			driver.get("http://www.harvard.edu/feedback");
		}
		
	}

}
