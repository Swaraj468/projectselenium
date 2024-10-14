import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class practice {

	public static WebDriver driver;
	
	public void openBrowser() {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.manage().window().setSize(new Dimension(1024, 768));		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("practice");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		practice obj = new practice();
		obj.openBrowser();
		

	}

}
