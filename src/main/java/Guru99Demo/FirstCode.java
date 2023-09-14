package Guru99Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='gdpr-consent-tool-wrapper']")).click();
	}

}
