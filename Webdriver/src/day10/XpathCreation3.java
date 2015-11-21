package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCreation3 {


	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.eenadu.net/hyderabad-news.aspx");
		driver.findElement(By.xpath("//a[@href='hyderabad-news-inner.aspx?item=break57']")).click();
		
	}

}
