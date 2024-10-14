import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

public class relativelocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
        driver.findElement(RelativeLocator.with(RelativeBy.name("email")).above(By.name("country"))).sendKeys("abc.gmail.com");	
        driver.findElement(RelativeLocator.with(RelativeBy.name("city")).below(By.name("country"))).sendKeys("Phagwara");
        driver.findElement(RelativeLocator.with(RelativeBy.linkText("Signin")).toRightOf(By.xpath("//*[@id=\"load_form\"]/div[1]/div[1]/p/a"))).click();
	}

}
