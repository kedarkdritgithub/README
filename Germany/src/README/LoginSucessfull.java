package README;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSucessfull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		         WebDriverManager.chromedriver().setup();
		        
		    	//Creating an object of ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        
		        String appUrl = "https://app.germanyiscalling.com/common/login/";
				driver.get(appUrl);

		        driver.manage().window().maximize();
		        
		            //Retrieving web page title
		        
		      		String title = driver.getTitle();
		      		System.out.println("The page title is : " +title);
		      		
		      		
		      		//Locating web element
		     
		      		WebElement uName = driver.findElement(By.id("username"));
		            WebElement pswd = driver.findElement(By.id("password"));
		            WebElement loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		      		
		      		//Performing actions on web elements
		            
		      		uName.sendKeys("Kedarkd1996@gmail.com");
		      		pswd.sendKeys("Kedar@1996");
		      		loginBtn.click();
		      		
		      	//driver.quit();
		        
			}

		}

			


