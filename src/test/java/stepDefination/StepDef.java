package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
	
	@Given("User Lunch Browser")
	public void user_lunch_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   
	}

	@When("User Open URL {string}")
	public void user_open_url(String Url) {
		
		driver.get(Url);
		driver.manage().window().maximize();
	   
	}

	@When("User Click On SignIn button")
	public void user_click_on_sign_in_button() {
		
		WebElement btn=driver.findElement(By.xpath("\"/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button"));
		
		btn.click();
	   
	}

	@When("Users enter Email as {string} and password as {string}")
	public void users_enter_email_as_and_password_as(String em, String pass) {
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(em);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pass);
	   
	}

	@When("User Click On Login button")
	public void user_click_on_login_button() {
		
		WebElement SignInBtn=driver.findElement(By.xpath("//span[text()='Sign In']"));
		SignInBtn.click();
		
	   
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be1(String ExpectedResult) {
		
		String ActualResult =driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
	   
	}

	@When("User Click On DownSide arrow")
	public void user_click_on_down_side_arrow() {
		
		WebElement AroowBtn=driver.findElement(By.xpath("//span[text()='Change']"));
		AroowBtn.click();
	   
	}

	@When("User Click On SignOut button")
	public void user_click_on_sign_out_button() {
		
		WebElement btn2=driver.findElement(By.xpath("//a[contains(text(), 'Sign Out')]"));
		btn2.click();
		
	    
	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String ExpectedResult) {
		
		String ActualResult=driver.getTitle();
		Assert.assertEquals(ActualResult, ExpectedResult);
	    
	}

	@Then("Close browser")
	public void close_browser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.close();
	  
	}


	
}