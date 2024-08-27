/*
 Q2. Write a selenium script that opens the chrome browser, navigates to "https://www.demoblaze.com",
 maximizes the browser window, verifies if the title of the page is "STORE" and prints "Page landed on
 correct website", if the title matches, else prints "Page not landed on correct website".
 */

package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuestionTwo {

	public static void main(String[] args) throws Exception {
		
		//Setting up chrome driver      
		WebDriverManager.chromedriver().setup();
		
	    //Creating an instance of chrome driver
		WebDriver driver=new ChromeDriver();
		
		//Navigating to the given URL
		driver.get("https://www.demoblaze.com");
				
		//Maximizing the browser window
		driver.manage().window().maximize();
		
		//Storing the exact webpage's title name in a string variable
		String PageTitle = "STORE";
		
		//Storing the extracted title name in a string variable
		String Title = driver.getTitle();
		
		//Comparing if the title name matches
		if(Title.equals(PageTitle))
		{
			System.out.println("Page landed on correct website");
		}
		else
		{
			System.out.println("Page not landed on correct website");
		}
		
		
		//Close the browser
		driver.close();

			}
	}


/* Output :
 
 Page landed on correct website
 
 
 */

