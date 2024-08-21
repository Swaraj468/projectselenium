package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	
	WebDriver driver;
	public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("https://practice.expandtesting.com/login/");
        driver.findElement(By.id("APjFqb")).submit();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
        driver.findElement(By.id("username")).sendKeys("practice");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo obj = new demo();
		obj.openBrowser();

	}

}
