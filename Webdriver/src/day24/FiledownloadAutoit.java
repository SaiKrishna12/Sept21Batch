package day24;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FiledownloadAutoit {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.48.2")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("c:\\users\\sai\\desktop\\download.exe");
		
		

	}

}
