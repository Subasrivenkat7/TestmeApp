package casepackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import casepackage.Casestudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginstep {
	WebDriver driver;
	@Given("user click the signin button")
	public void user_click_the_signin_button() 
	{
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    
	}

	@Given("user enter the  username {string}")
	public void user_enter_the_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@Then("user enter the password {string}")
	public void user_enter_the_password(String string) 
	{
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("user click the login button")
	public void user_click_the_login_button()
	{
		driver.findElement(By.name("Login")).click();
	}


}
