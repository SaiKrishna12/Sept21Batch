package stepDefinition;

	

import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class CucumberTest {
		static FirefoxDriver driver;
		@Given("^the browser is launched and the page is opened$")
		public void the_browser_is_launched_and_the_page_is_opened() throws Throwable {
		    driver=new FirefoxDriver();
		    driver.get("http://localhost:8090/orangehrm");
		}

		@When("^the user enter username and password$")
		public void the_user_enter_username_and_password() throws Throwable {
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		}

		@When("^clicks on the login button$")
		public void clicks_on_the_login_button() throws Throwable {
		    driver.findElement(By.id("btnLogin")).click();
		}

		@Then("^it should the welcome message$")
		public void it_should_the_welcome_message() throws Throwable {
			String expmsg="Welcome Admin";
			String actmsg=driver.findElement(By.id("welcome")).getText();
			Assert.assertEquals(actmsg,expmsg );
		}
		
		@When("^the user clicks on the welcome admin link$")
		public void the_user_clicks_on_the_welcome_admin_link() throws Throwable {
		    driver.findElement(By.linkText("Welcome Admin")).click();
		    Thread.sleep(1000);
		}

		@When("^also click on the logout link$")
		public void also_click_on_the_logout_link() throws Throwable {
		    driver.findElement(By.linkText("Logout")).click();
		    
		}

		@Then("^it should come to the login page$")
		public void it_should_come_to_the_login_page() throws Throwable {
		    String exptitle="OrangeHRM";
		    String acttitle=driver.getTitle();
		    Assert.assertEquals(acttitle, exptitle);
		}





	}


}
