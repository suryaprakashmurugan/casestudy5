package cucumbercasestudy2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy3definition {
	WebDriver driver;
	@Given("^open testme$")
	public void open_testme() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_C2d.02.11\\eclipse-workspace\\cucumbercasestudy2\\src\\test\\resources\\chromedriver.exe");
	  	  driver=new ChromeDriver(); 
	  	  driver.manage().window().maximize();
          driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}

	@And("^Enter username and password$")
	public void enter_username_and_password1() throws Throwable {
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	}

	@And("^clik login button$")
	public void clik_login_button() throws Throwable {
	    driver.findElement(By.name("Login")).click();
    Thread.sleep(1000);
	}
	@And("^search product in searchbutton and click appropriate results$")
	public void search_product_in_searchbutton_and_click_appropriate_results() throws Throwable {

		driver.findElement(By.name("products")).sendKeys("h");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("e");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("a");
		Thread.sleep(1000);
		driver.findElement(By.name("products")).sendKeys("d");
		driver.findElement(By.xpath("//*[contains(text(),'Headphone')]")).click();
	}

	@And("^click find product$")
	public void click_find_product() throws Throwable {
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@And("^add to cart$")
	public void add_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a[class='btn btn-success btn-product']")).click();
	}

	@And("^click cart$")
	public void click_cart() throws Throwable {
	  driver.findElement(By.cssSelector("i[class='fa fa-shopping-cart']")).click();
	}

	@And("^checkout$")
	public void checkout() throws Throwable {

		  driver.findElement(By.cssSelector("a[class='btn btn-success btn-block']")).click();
	}

	@And("^procede to pay$")
	public void procede_to_pay() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}
	@And("^choose bank$")
	public void choose_bank() throws Throwable {
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[contains(text(),'Andhra Bank')]")).click();
	}

	@And("^click on continue$")
	public void click_on_continue() throws Throwable {
		   driver.findElement(By.id("btn")).click();

	    
	}
    @And("^enter username and password$")
	public void enter_username_and_password() throws Throwable
	{
	   driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	}

    @And("^continue to pay$")
    public void continue_to_pay() throws Throwable {
    	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
       
    }


	@And("^enter transaction password$")
	public void enter_transaction_password() throws Throwable {
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	}
	@Then("^click paynow$")
	public void click_paynow() throws Throwable {
	    
	    driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}


}
