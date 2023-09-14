package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
;

public class MouseAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users/GAdmin/Desktop/AutoTraining/wk9_selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
Actions mouseaction = new Actions(driver);
		driver.get("http://jQueryui.com/");
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame("demo=frame");
	//mouseaction.dragAndDropBy(driver.findElement(By.id("draggable")), 200px , 100px );
//	mouseaction.dragAndDropBy(driver.findElement(By.id("draggable")), 200px, 100px);
		
	}

}
