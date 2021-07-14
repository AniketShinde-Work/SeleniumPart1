package dropdownandcheckList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDripdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[@value='DEL']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
//		

		// not using index
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JAI']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
//		

		// using css
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_originStation1_CTNR'] a[value='JAI']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='BOM']")).click();

		// auto-suggestion-dropbox
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));

		for (WebElement option : options) {
			option.getText();
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
	}

}
