package FirstAutom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// configuer Webdriver and browser
		
		// run chrome driver 
		//run firefox .
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Navigate to given URL
		driver.get("https://www.facebook.com/");
		
		//maximize window 
		driver.manage().window().maximize();
		
		// get headername
		
		//driver.getTitle();
		System.out.println("This is the FirstTitle = "+driver.getTitle());
		
		String PageTitle = driver.getTitle();
		System.out.println("This is the second Title = " +PageTitle);
		
		String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	    
	    driver.get("https://www.google.com/");
	    
	   System.out.println(driver.getCurrentUrl());   
	   
	   driver.navigate().back();
	   
	   driver.navigate().forward();
	   
	   driver.navigate().refresh();
	   
	   
	   
	   
	   //
	   driver.close();// close the current session browser 
	   //driver.quit();// close all sessions 
	   
	    
            
	}

}
