package Axis1.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://www.makemytrip.com/");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       WebElement Date= driver.findElement(By.xpath("//label[@for ='Departure']"));
		        
		       Date.click();
		       Thread.sleep(1000);
		       
		       WebElement newDate= driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
		       
		       newDate.click();
	}

}
