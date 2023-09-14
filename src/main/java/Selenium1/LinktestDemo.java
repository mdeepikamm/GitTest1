package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktestDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       //driver.navigate("https://google.com");
        Thread.sleep(2000);
      //  driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        
        driver.get("file:///C:/Users/GAdmin/Desktop/AutoTraining/wk9_selenium/XpathExample.html");
      //  driver.findElement(By.xpath("//body/form/input[2]")).click();
        //driver.findElement(By.xpath("//form/input[2]")).click();
       // driver.findElement(By.xpath("//input[2]")).click();
        //driver.findElement(By.xpath("//input[@name='field2']")).click();
      //  driver.findElement(By.xpath("//input[@name='field2']")).click();
        
        //driver.quit();
	}

}
