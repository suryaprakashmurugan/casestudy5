package cucumbercasestudy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class casestudy4deifinition {
	WebDriver driver;
	@Given("^open and login to testme app$")
	public void open_and_login_to_testme_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\eclipse-workspace\\cucumbercasestudy2\\src\\test\\resources\\chromedriver.exe");
	  	  driver=new ChromeDriver(); 
	  	  driver.manage().window().maximize();
        driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
        driver.findElement(By.id("userName")).sendKeys("lalitha");
  	  driver.findElement(By.id("password")).sendKeys("password123");
  	 driver.findElement(By.name("Login")).click();
	}

	@And("^search for product headphone$")
	public void search_for_product_headphone() throws Throwable {

		driver.findElement(By.name("products")).sendKeys("h");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("e");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("d");
		driver.findElement(By.xpath("//*[contains(text(),'Headphone')]")).click();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@And("^proceed to payment without adding to card$")
	public void proceed_to_payment_without_adding_to_card() throws Throwable {
		 Assert.assertNotSame("View Cart", driver.getTitle()); 
	}

	@Then("^testme doesnt allow to enter without proceeding to payment$")
	public void testme_doesnt_allow_to_enter_without_proceeding_to_payment() throws Throwable {
		   System.out.println("can't proceed to th payment,Add items in cart");
	}


}
