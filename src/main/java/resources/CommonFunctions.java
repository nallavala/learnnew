package resources;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonFunctions {
    public static WebDriver driver;
	WebElement search = Base.driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchButton = Base.driver.findElement(By.id("nav-search-submit-button"));
	//List<WebElement> autoSearch = Base.driver.findElements(By.xpath("//*[contains(@id,'sac-suggestion-row')]"));
	
	public void search() throws Exception {
		search.sendKeys("mobiles");
		//searchButton.click();
		Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(Base.driver, Duration.ofSeconds(10));
        
        // Find the elements by XPath
        List<WebElement> autoSearch = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(@id,'sac-suggestion-row')]")));
        
        // Print the size of the list (number of matching elements)
        System.out.println("Number of auto search suggestions: " + autoSearch.size());
		int size = autoSearch.size();
		System.out.println(size);
		for(WebElement ele:autoSearch) {
			//System.out.print(ele.getText());
			if(ele.getText().equals("mobiles under 20000 5g phones latest")) {
				ele.click();
				System.out.println("test");
				System.out.println("test22");
				System.out.println("test33");
				System.out.println("test44");
				System.out.println("test55");
				System.out.println("test65");
				break;
			}
		}	
	}
}
