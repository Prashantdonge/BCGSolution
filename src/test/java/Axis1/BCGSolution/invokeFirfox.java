package Axis1.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokeFirfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


			System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here");
		       WebDriver driver = new FirefoxDriver();
		       driver.get("https://www.selenium.dev/");

	}

}
