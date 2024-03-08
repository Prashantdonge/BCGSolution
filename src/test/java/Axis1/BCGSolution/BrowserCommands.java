package Axis1.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		



			System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://automationexercise.com/");
		       
		       //get url
		       String title = driver.getTitle();
		       System.out.println(title);
		       
		       //get currentUrl
		       
		       String currenturl = driver.getCurrentUrl();
		       System.out.println(currenturl);
		       
		       // get page source code
		       String pagesource = driver.getPageSource();
		       System.out.println(pagesource);
		       
		       // close () - to close the current browser session
		       
		         driver.close();
		       
	}

}
