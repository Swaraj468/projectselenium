package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Caractice {
    public static void main(String[] args) throws InterruptedException {
        // Initialize EdgeDriver
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_up");

        // Use Thread.sleep to wait for 3 seconds
        Thread.sleep(3000);

        // Interact with elements
        driver.findElement(By.xpath("//*[@id=\"gLIfn4\"]/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"user[first_name]\"]")).sendKeys("swaraj");
        driver.findElement(By.xpath("//*[@id=\"user[last_name]\"]")).sendKeys("Gupta");
        driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("swarajgupta654@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("Swaraj");
        driver.findElement(By.xpath("//*[@id=\"user[terms]\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"sign_up_478fae54ba\"]/div[6]/button")).click();
        
        // Close the browser
        driver.quit();
    }
}
