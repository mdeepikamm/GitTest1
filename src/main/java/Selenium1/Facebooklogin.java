package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin{

	public static void main(String[] args)  throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://facebook.com");
        driver.navigate().to("https://facebook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
        driver.findElement(By.name("email")).sendKeys("autotest202023");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("Test@2023");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
     
       
	}

}


