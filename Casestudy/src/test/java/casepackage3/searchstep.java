package casepackage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import casepackage.Casestudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class searchstep {
	WebDriver driver;
	@Given("user enters the username {string}")
	public void user_enters_the_username(String string)
	{ 
	driver=UtilityClass.getDriver("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.name("userName")).sendKeys(string);
	   
	}

	@Given("user enters the password {string}")
	public void user_enters_the_password(String string) 
	{
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@Then("user click login button")
	public void user_click_login_button() 
	{
		driver.findElement(By.name("Login")).click();
	}

	@Then("user search product {string}")
	public void user_search_product(String string) {
		driver.findElement(By.id("myInput")).sendKeys(string);
		//driver.findElement(By.name("Headphone")).click();
	}

	@Then("user click Find details")
	public void user_click_Find_details() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

}
