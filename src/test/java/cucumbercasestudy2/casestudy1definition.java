package cucumbercasestudy2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy1definition {
	WebDriver driver;
	@Given("^open Testme app$")
	public void open_Testme_app() throws Throwable {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\eclipse-workspace\\cucumbercasestudy2\\src\\test\\resources\\chromedriver.exe");
	  	  driver=new ChromeDriver(); 

		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Given("^click signup button$")
	public void click_signup_button() throws Throwable {
		driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("^enter username$")
	public void enter_username() throws Throwable {
		 driver.findElement(By.id("userName")).sendKeys("suryapr");
	}

	@Given("^enter firstname$")
	public void enter_firstname() throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys("surya");
	}

	@Given("^enter lastname$")
	public void enter_lastname() throws Throwable {
		driver.findElement(By.id("lastName")).sendKeys("pr");
	}

	@Given("^enter password$")
	public void enter_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("suryapr");
	}

	@Given("^conform password$")
	public void conform_password() throws Throwable {
		driver.findElement(By.id("pass_confirmation")).sendKeys("suryapr");
	}

	@Given("^select gender$")
	public void select_gender() throws Throwable {
		driver.findElement(By.id("gender")).click();
	}

	@Given("^Enter email addres$")
	public void enter_email_addres() throws Throwable {
		driver.findElement(By.id("emailAddress")).sendKeys("suryaprakash97@gmail.com");
	}

	@Given("^enter mobile number$")
	public void enter_mobile_number() throws Throwable {
		 driver.findElement(By.id("mobileNumber")).sendKeys("8870224353");
	}

	@Given("^enter DOB$")
	public void enter_DOB() throws Throwable {
		 driver.findElement(By.id("dob")).sendKeys("19/09/1909");
	}

	@Given("^enter address$")
	public void enter_address() throws Throwable {
	 
	}

	@Given("^Select security question$")
	public void select_security_question() throws Throwable {
		driver.findElement(By.id("address")).sendKeys("205 tvmalai");
	}

	@When("^answer to security question$")
	public void answer_to_security_question() throws Throwable {
		driver.findElement(By.id("answer")).sendKeys("monkey");
	}

	@Then("^click register$")
	public void click_register() throws Throwable {
		 driver.findElement(By.name("Submit")).click();
	}


}
