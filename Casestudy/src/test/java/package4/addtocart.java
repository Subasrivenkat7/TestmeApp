package package4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import casepackage.Casestudy.UtilityClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class addtocart 
{
	WebDriver driver;

@Given("Alex has registerd into Testme App")
public void alex_has_registerd_into_Testme_App1() 
{
	driver=UtilityClass.getDriver("Chrome");
	driver.get("http://10.232.237.143:443/TestMeApp");
	driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By.name("userName")).sendKeys("AlexUser");
	driver.findElement(By.name("password")).sendKeys("Alex@123");
	driver.findElement(By.name("Login")).click();
}

@When("Alex search product {string}")
public void alex_search_product(String string) 
{
	driver.findElement(By.id("myInput")).sendKeys("headphone");
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}
@When("Try to proceed to payment without adding any item inthe Cart")
public void try_to_proceed_to_payment_without_adding_any_item_inthe_Cart1() 
{
	System.out.println("Trying to click payments");
}


	@Then("Testme doesn't display the cart icon")
	public void testme_doesn_t_display_the_cart_icon1()
	{
		Assert.assertNull(driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")));
		 
		driver.close();

	}
	


	@Given("Alex login to the Testme App")
	public void alex_login_to_the_Testme_App()
	{
		driver=UtilityClass.getDriver("Chrome");
		 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		 
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
		 
		driver.findElement(By.name("Login")).click();

	}

	@Given("Alex  Search a product")
	public void alex_Search_a_product() 
	{
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Alex add the product to cart")
	public void alex_add_the_product_to_cart() 
	{
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("click the cart icon")
	public void click_the_cart_icon() 
	{
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@Then("type the quantity and click checkout")
	public void type_the_quantity_and_click_checkout() 
	{
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	}

	@Then("user Redirected to paymentspage")
	public void user_Redirected_to_paymentspage() 
	{
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@Then("payment page is displayed")
	public void payment_page_is_displayed()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));
		 
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 
		driver.findElement(By.id("btn")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		 
		driver.findElement(By.name("username")).sendKeys("123456");
		 
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
		 
		WebDriverWait waitt = new WebDriverWait(driver, 10);
		 
		waitt.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h4")));
		 
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		 
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[2]/input")).click();

	}

	@Then("ordered detail is displayed")
	public void ordered_detail_is_displayed() 
	{
		Assert.assertEquals(driver.getTitle(), "Order Details"); 
	}


}
