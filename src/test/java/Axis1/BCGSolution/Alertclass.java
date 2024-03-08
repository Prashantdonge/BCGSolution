package Axis1.BCGSolution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       
		       driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       
		       //infomation alert
		       
		       
		       WebElement infoalt= driver.findElement(By.xpath("//input[@name ='alert']"));
		       
		       infoalt.click();
		       
		       Thread.sleep(500);
		       
		       Alert alt = driver.switchTo().alert();
		       alt.accept();
		       
		       //conformation alert
		       
                 WebElement comfalt= driver.findElement(By.xpath("//input[@name ='confirmation']"));
		       
		       comfalt.click();
		       
		       Thread.sleep(500);
		       
		       Alert alt1 = driver.switchTo().alert();
		       
		       alt1.accept();
		       
		       //prompt alert
		       
  WebElement promalt= driver.findElement(By.xpath("//input[@name ='prompt']"));
		       
		       promalt.click();
		       
		       Thread.sleep(500);
		       
		       Alert alt3 = driver.switchTo().alert();
		       
		       alt3.accept();
		       
		       
		       
		       
		       
	}

}
