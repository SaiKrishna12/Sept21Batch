package day31;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class BrokenLinks {

	
	public static void main(String[] args) throws MalformedURLException, IOException {
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://qedgetech.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			String response=brokenLinks(new URL(links.get(i).getAttribute("href")));
			System.out.println(links.get(i).getText()+"--"+response);
		}
	}
	
	
	public static String brokenLinks(URL url) throws IOException
	{
		String response=null;
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		try
		{
			conn.connect();
			response=conn.getResponseMessage();
			conn.disconnect();
		}
		catch(Exception e)
		{
			response=e.getMessage();
		}
		return response;
	}

}
