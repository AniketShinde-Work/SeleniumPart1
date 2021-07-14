package actionsandframes;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		WebElement link=driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
		
		Actions act = new Actions(driver);
		act.moveToElement(link).click().build().perform();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
		String info = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String[] infosplit= info.split("at");
		String preemail = infosplit[1];
		String[] mail = preemail.split("with");
		String actualmail= mail[0];
		
	
	
		driver.switchTo().window(parent);
		driver.findElement(By.className("form-control")).sendKeys(actualmail);
		
	}

}
