package Axis1.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class invokeChrome {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.selenium.dev/");
	}

}
