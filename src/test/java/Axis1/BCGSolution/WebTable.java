package Axis1.BCGSolution;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\hp\\Documents\\manipal here\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("https://the-internet.herokuapp.com/tables");
		       driver.manage().window().maximize();
		       
		       // WAIT ALL THE ELEMENTS OF SCRIPT TO THE LOAD
		       driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		       
		       
		       
		       Thread.sleep(500);
		       
		       List <WebElement> rowno= driver.findElements(By.xpath("//table[@id='table']/tbody/tr"));
		       
		       int rowcount = rowno.size();
		       
		       System.out.println(rowcount);
		       
		    // find the no. of columns
		       
                List <WebElement> colno= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		       
		       int colcount = colno.size();
		       
		       System.out.println(colcount);
		       
		       // fetch the cell data from the particular cell
		       
		       WebElement celldata= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
		       
		       // WAIT IS USED TO FOR A PARTICULAR ELEMTS
		       
		       WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		       
		       wait.until(ExpectedConditions.visibilityOfElementLocated(""));
		       
		       String text = celldata.getText();
		       
		       System.out.println(text);
		       
		       String expectedtext= "tconway@earthlink.net";
		       
		       if(text.equals (expectedtext)) {
		    	   
		    	   
		    	   System.out.println("the cell data is correct");
		    	   
		    	   
		       }else {
		       
		    	   System.out.println("the cell data is notcorrect");
	}

	}
	}
