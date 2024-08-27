/*
  Q1. Write a selenium script that opens the the Firefox browser, maximizes the browser window, navigates to 
  "https://www.google.com/", prints the URL of the current page, reloads the page and closes the browser.
 */

package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuestionOne {

	public static void main(String[] args) throws Exception {

		//Set up firefox driver
		WebDriverManager.firefoxdriver().setup();
		
		//Creating an instance of firefox driver
		WebDriver driver=new FirefoxDriver();
		
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Launching the URL 
		driver.get("https://www.google.com/");
		
		//Getting the name of the current Url in a string for printing
		String str = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		//printing the URL of current page
		System.out.println("URL of the current webpage : "+str);
		
		//Reloading the page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//CLose the browser
		driver.close();
		
	}

}


/* Output:
 
 URL of the current webpage : https://www.google.com/
 
 */
