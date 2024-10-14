package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demobrokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no. of links" + links.size());
		
		for(WebElement link: links) {
			System.out.println("----------------------------------");
			System.out.println(link.getText()+ " " + link.getAttribute("href"));
		}
		

	}

}
