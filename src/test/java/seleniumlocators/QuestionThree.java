/*
 Q3. Write a selenium script that opens the chrome broswer , navigates to "https://www.wikipedia.org",
 maximizes the browser window, searches for the query "Artificial Intelligence", clicks on "History" section
 in the search results and prints the title of the section.
 */


package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuestionThree {

	public static void main(String[] args) throws Exception {
		
		        //Setting up chrome driver      
				WebDriverManager.chromedriver().setup();
				
			    //Creating an instance of chrome driver
				WebDriver driver=new ChromeDriver();
				
				//Navigating to the given URL
				driver.get("https://www.wikipedia.org/");
						
				//Maximizing the browser window
				driver.manage().window().maximize();
				
				//Locating the search textfield and searching the given query
				driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence");
				
				Thread.sleep(2000);
				
				//Clicking on search button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(2000);
				
				//Clicking the history section on the next page
				driver.findElement(By.xpath("//a[@accesskey='h']//span[text()='View history']")).click();
				
				//Printing the title of current section
				System.out.println("Title of the current page : "+ driver.getTitle());
				
				//Close the browser
				driver.close();
				

	}

}


/* Output :

Title of the current page : Artificial intelligence: Revision history - Wikipedia

*/