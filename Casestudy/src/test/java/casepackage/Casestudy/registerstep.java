package casepackage.Casestudy;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class registerstep {
	WebDriver driver;
	@Given("Testme app is displayed")
	public void testme_app_is_displayed() {
		driver=UtilityClass.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp");
	    System.out.print("In TestMe app");
	}
	@Given("user click the signup button")
	public void user_click_the_signup_button() {
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	   
	}
	@Then("user enter User name {string}")
	public void user_enter_User_name(String string)
	{
		driver.findElement(By.name("userName")).sendKeys(string);
	}




	

	@Then("user is on the register page")
	public void user_is_on_the_register_page() {
		 System.out.println("Register page");
	}

	
	@Then("user enter the First Name {string}")
	public void user_enter_the_First_Name(String string) {
		driver.findElement(By.name("firstName")).sendKeys(string);

	}

	@Then("user enter the Last Name {string}")
	public void user_enter_the_Last_Name(String string) 
	{
		driver.findElement(By.name("lastName")).sendKeys(string);

	}

	@Then("user enter the password {string}")
	public void user_enter_the_password(String string) 
	{
		 driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("user enter the confirm password {string}")
	public void user_enter_the_confirm_password(String string)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(string);

	}

	@Then("user enter the click the Gender")
	public void user_enter_the_click_the_Gender()
	{
		 driver.findElement(By.xpath("//*[@id='gender']")).click();
	}
	@Then("user enter the E-mail {string}")
	public void user_enter_the_E_mail(String string) 
	{
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@Then("user enter the Mobile Number  {string}")
	public void user_enter_the_Mobile_Number(String string)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@Then("user enter the DOB {string}")
	public void user_enter_the_DOB(String string) 
	{
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@Then("user enter the Address {string}")
	public void user_enter_the_Address(String string)
	{
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@Then("user enter click the  Security Question {string}")
	public void user_enter_click_the_Security_Question(String string)
	{
		driver.findElement(By.name("securityQuestion")).sendKeys(string);
	}

	@Then("user enter the answer {string}")
	public void user_enter_the_answer(String string) 
	{
		driver.findElement(By.id("answer")).sendKeys(string);
	}

	@Then("User click the register button")
	public void user_click_the_register_button()
	{
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();

	}

}
