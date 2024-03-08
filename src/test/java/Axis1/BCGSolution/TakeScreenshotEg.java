package Axis1.BCGSolution;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://www.makemytrip.com/");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);

		       //Take screen shot class and getscreenShotAs - method
		       
		       File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		       
		       FileUtils.copyFile(f, new File("C:\\Users\\hp\\Documents\\manipal here\\screenshot.png"));
		       
		       System.out.println("this ur screenshot");
	}

}
