package Axis1.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Horizontalscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://www.facebook.com/login/");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       // vertical down scroll (x and y coordinates)
		       
		       JavascriptExecutor js = (JavascriptExecutor)driver;
               
//		       js.executeScript("window scrollBy(0,800)","");
//		       
//		       vertical up scroll (x and y coordinates)
//		       
//		       js.executeScript("window scrollBy(0,-400)","");
		       
		       WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024']"));
			js.executeScript("argument[0].scrollIntoView(true);",ele);
		
		       
	}

}
