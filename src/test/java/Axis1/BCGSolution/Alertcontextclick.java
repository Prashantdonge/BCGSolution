package Axis1.BCGSolution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alertcontextclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       //double click
		       
		       WebElement doubleclickele= driver.findElement(By.xpath("//input[@id='double-click']"));
		       
		       Actions builder= new Actions(driver);
		       
		       builder.contextClick(doubleclickele).perform();
		       
              }

}
