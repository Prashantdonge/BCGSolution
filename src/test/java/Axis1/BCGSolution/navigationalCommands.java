package Axis1.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://automationexercise.com/");
		       
		       
		       
		     //navigate forward in browser history
		       driver.navigate().forward();
		       
		      
		       Thread.sleep(500);
		       
		       //navigate backward in browser history
		       driver.navigate().back();
		       
		       Thread.sleep(500);
		       
		       
		       
		       
		     //refresh page
		       driver.navigate().refresh();     
		       
		       driver.close();
	}

}
