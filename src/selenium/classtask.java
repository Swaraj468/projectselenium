package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class classtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Swaraj");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Gupta");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Phagwara, punjab");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("swaraj@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8235200043");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
//		Select language = new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
//		language.selectByIndex(7);
		
		
		driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[11]")).click();
//		driver.findElement(By.xpath("//*[@id=\"countries\"]")).click(); 
		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
		dropdown1.selectByIndex(0);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[3]")).click();
		
//	dropdown starts here
//		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")));
//		dropdown.selectByIndex(9);
//		Select dropdown1 = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
//		dropdown1.selectByIndex(0);
//		Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")));
//		dropdown2.selectByIndex(4);
//		Select dropdown3 = new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
//		dropdown3.selectByIndex(1);
//		Select dropdown4 = new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
//		dropdown4.selectByIndex(2);
//		Select dropdown5 = new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
//		dropdown5.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("Swaraj");
		driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("Swaraj");
	}

}
