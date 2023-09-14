package Selenium1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelenimDemo1 {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
   
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
         driver.manage().window().maximize();  
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.findElement(By.name("username")).sendKeys("Admin");
        
        driver.findElement(By.name("password")).sendKeys("admin123");
  
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    
        driver.findElement(By.linkText("Admin")).click();
        
 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Deepi");
 
// WebElement userRole = driver.findElement(By.xpath("(//div[contains(text(),'-- Select --')])[1]"));



   driver.findElement(By.linkText("PIM")).click();

driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("test");

/*
driver.findElement(By.xpath("//span[normalize-space()='User Management']")).click();

driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();

driver.findElement(By.xpath("//span[normalize-space()='Configuration']")).click();

driver.findElement(By.xpath(" //a[normalize-space()='Email Configuration']")).click();

driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("testmail");
*/
 //dropdown.selectByValue("ESS");

 //  driver.findElement(By.linkText("Username")).sendKeys("test1");

	}

}
