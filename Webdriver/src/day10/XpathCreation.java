package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathCreation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		List<WebElement> headlines=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for(int i=0;i<headlines.size();i++)
		{
			System.out.println(headlines.get(i).getText());
		}
	}

}
