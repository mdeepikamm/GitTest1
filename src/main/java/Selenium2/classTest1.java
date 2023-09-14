package Selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class classTest1 {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 
	  Thread.sleep(2000);
	  driver.switchTo().frame("login_page");
	driver.findElement(By.linkText("CONTINUE")).click();
	Alert obj=  driver.switchTo().alert();
	  Thread.sleep(2000);
	  String expectedtext ="Customer ID  cannot be left blank.";

	  String actualtext = obj.getText();
	 // assertEquals(actualtext, expectedtext,"Text Mismatch");
		
		Assert.assertEquals(actualtext, expectedtext, "Text Mismatch");
		System.out.println(actualtext);	
		
	obj.accept();
	// driver.switchTo().defaultContent();

}
}
