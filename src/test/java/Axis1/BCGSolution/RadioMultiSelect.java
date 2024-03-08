package Axis1.BCGSolution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioMultiSelect {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		       driver.manage().window().maximize();
		       
		       List <WebElement> allcheck = (List<WebElement>) driver.findElements(By.xpath("//input[@class = 'cbi-element']"));
		       
		       Thread.sleep(500);
		       
		       for(WebElement wb : allcheck) {
		    	  ((org.openqa.selenium.WebElement) wb).click();
		       }
		       
	}

}
