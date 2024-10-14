import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class relativelocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/inputs");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-number")).above(By.name("input-text"))).sendKeys("3");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-text")).below(By.name("input-number"))).sendKeys("Yo");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-password")).below(By.name("input-text"))).sendKeys("swaraj");
		driver.findElement(RelativeLocator.with(RelativeBy.name("input-date")).below(By.name("input-password"))).sendKeys("04-12-2024");
		driver.findElement(RelativeLocator.with(RelativeBy.cssSelector("#btn-display-inputs")).toLeftOf(By.xpath("//*[@id=\"btn-clear-inputs\"]"))).click();
		

	}

}
