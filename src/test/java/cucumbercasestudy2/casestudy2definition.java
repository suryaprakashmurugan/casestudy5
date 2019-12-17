package cucumbercasestudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy2definition {
	WebDriver driver;
	@Given("^open testme app$")
	public void open_testme_app() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\eclipse-workspace\\cucumbercasestudy2\\src\\test\\resources\\chromedriver.exe");
	  	  driver=new ChromeDriver(); 

		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@And("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable {
	  driver.findElement(By.id("userName")).sendKeys(arg1);
	  driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@Then("^click login button$")
	public void click_login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	}


}
