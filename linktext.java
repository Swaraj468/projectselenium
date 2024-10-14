import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class linktext {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("google");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
		driver.findElement(By.linkText("multinational corporation")).click();
		driver.findElement(By.partialLinkText("Black's Law")).click();
		
		

	}

}
