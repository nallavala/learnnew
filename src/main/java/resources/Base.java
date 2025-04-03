package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public static WebDriver driver;
		public void launchURL() {		
			driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		}
}
