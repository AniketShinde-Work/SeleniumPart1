package actionsandframes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://www.amazon.co.uk/");
		Actions act=new Actions(driver);
		driver.findElement(By.cssSelector("input[name='accept']")).click();
		
		WebElement move=driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(move).contextClick().build().perform();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("Haldiram").doubleClick().build().perform();
		
		
	}

}
