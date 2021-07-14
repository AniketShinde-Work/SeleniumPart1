package dropdownandcheckList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				WebDriver driver  = new ChromeDriver();				
				driver.get("https://www.makemytrip.com/");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				driver.findElement(By.cssSelector("div[data-cy='outsideModal']")).click();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.findElement(By.id("fromCity")).click();	
				driver.findElement(By.cssSelector("ul[role = 'listbox'] li")).click();
				//driver.findElement(By.xpath("//ul[@role = 'listbox']/li[2]")).click();
				driver.findElement(By.id("react-autowhatever-1-section-0-item-1'")).click();
				driver.findElement(By.className("todayPrice")).click();
				
				
				//driver.findElement(By.cssSelector("div[role='combobox'] input")).sendKeys("Mumbai");
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				driver.findElement(By.xpath("//ul[@class = 'autoComplete']/li[2])")).click();
	}
}
