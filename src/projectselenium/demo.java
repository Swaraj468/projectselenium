package projectselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	
	WebDriver driver;
	public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://practice.expandtesting.com/login");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo obj = new demo();
		obj.openBrowser();

	}

}
