package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/b")
	WebElement admin;
	public void admin()
	{
		admin.click();
	}
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	WebElement pim;
	public void pim()
	{
		pim.click();
	}
	
	@FindBy(xpath="//*[@id='menu_leave_viewLeaveModule']/b")
	WebElement leave;
	public void leave()
	{
		leave.click();
	}
	
	@FindBy(xpath="//*[@id='menu_time_viewTimeModule']/b")
	WebElement time;
	public void time()
	{
		time.click();
	}
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	WebElement recruitment;
	public void recruitment()
	{
		recruitment.click();
	}
	
	
	@FindBy(linkText="Welcome Admin")
	WebElement welcomeadmin;
	@FindBy(linkText="Change Password")
	WebElement changepassword;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void logout() throws InterruptedException
	{
		welcomeadmin.click();
		Thread.sleep(8000);
		logout.click();
	}
	
 
}
