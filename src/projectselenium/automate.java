package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class automate {
	
	public static WebDriver driver;

	
	public void openBrowser() {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[1]/input")).sendKeys("swaraj");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[1]/p[2]/input")).sendKeys("Gupta");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[2]/div/label[1]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[3]/div/label[2]/input")).click();
        
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[4]/select")));
        dropdown.selectByIndex(0);
        Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[1]/select")));
        dropdown1.selectByIndex(1);
        Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[2]/select")));
        dropdown2.selectByIndex(1);
        Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[5]/div[3]/select")));
        dropdown3.selectByIndex(1);


        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[6]/input")).sendKeys("+91-8235107591");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[7]/input")).sendKeys("swaraj07");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[8]/input")).sendKeys("swaraj@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[10]/textarea")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[11]/input")).sendKeys("Gupta");
        driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[12]/input")).sendKeys("Gupta");
//      driver.findElement(By.xpath("//*[@id=\"register_form\"]/fieldset[13]/input")).click();
        
        String title = driver.getTitle();
        
        System.out.println(title);
        System.out.println(title.length());
//        driver.close();
//        driver.quit();
        
	}
        

        		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automate obj = new automate();
		obj.openBrowser();

	}

}
