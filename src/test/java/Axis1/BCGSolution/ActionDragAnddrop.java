package Axis1.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAnddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		       driver.manage().window().maximize();
		       
		       Thread.sleep(500);
		       
		       // drag and drop
		       WebElement src= driver.findElement(By.xpath("//div[@id='column-a']"));
		       
		       WebElement dest= driver.findElement(By.xpath("//div[@id='column-b']"));
		       
		       
		       Actions builder= new Actions(driver);
		       builder.dragAndDrop(src,dest);
	           
		       System.out.println("the iteam is drag and drop");
		       
		       
	}

}
