package cucumbercasestudy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
static WebDriver driver;
public static WebDriver startBrowser(String browsername,String url)
{
	if(browsername.equalsIgnoreCase("Chrome"))
	{
		System.getProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("IE"))
	{
		System.getProperty("webdriver.ie.driver","IEDriverServer.exe");
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}
}
