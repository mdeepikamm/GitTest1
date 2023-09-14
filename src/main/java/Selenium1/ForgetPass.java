package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
        Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
