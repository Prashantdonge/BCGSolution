package Axis1.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploaddownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		       driver.manage().window().maximize();
		       
 
		       
		       WebElement upload= driver.findElement(By.xpath("(//input[@name=]'upload'])[2]"));
		       
	}

}
