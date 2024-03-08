package Axis1.BCGSolution;

import org.apache.commons.lang3.builder.Builder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeybordEvents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://www.facebook.com/login/");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
	           
		       Actions builder= new Actions(driver);
		       
		       
		       Action seriesofact= builder.moveToElement(email).click().
		    		   keyDown(email, Keys.SHIFT).sendKeys(email,"Prashant").build();
	          
	 seriesofact.perform();
	
	
	}

}
