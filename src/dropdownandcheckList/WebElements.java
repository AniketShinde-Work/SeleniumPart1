package dropdownandcheckList;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class WebElements {
// Static dropdown 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		
//		Select dropdown = new Select(staticdrop);
//		dropdown.selectByIndex(1);
		
		//Another dropdown
		driver.findElement(By.id("divpaxinfo")).click();		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		int i =1;
//		while(i<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
