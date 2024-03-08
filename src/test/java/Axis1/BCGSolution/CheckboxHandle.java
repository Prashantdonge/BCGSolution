package Axis1.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://the-internet.herokuapp.com/checkboxes");
		       
		       
		       driver.manage().window().maximize();
		       
		       WebElement chkbox2= driver.findElement(By.xpath("(//input[@type=]'checkbox'])[2]"));
		       
		       Thread.sleep(500);
		       
		       chkbox2.click();
		       
		       if(chkbox2.isSelected()) {
		    	   chkbox2.click();
		       }
		       
		       WebElement chkbox1= driver.findElement(By.xpath("(//input[@type=]'checkbox'])[1]"));
	           
		       if(chkbox1.isEnabled()) {
		    	   chkbox1.click();
		       }
		       
		       
		       
		       
	}

}
