package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();

	}

}
