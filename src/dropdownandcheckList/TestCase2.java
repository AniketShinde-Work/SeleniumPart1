package dropdownandcheckList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		
		//for google
	driver.get("https://google.com");
		driver.findElement(By.id("L2AGLb")).click();
		System.out.println(driver.getTitle());
	driver.get("https://linkedIn.com");
		driver.navigate().back();
		driver.close();
		
		
	//for instagram
//		driver.get("https://instagram.com");
//		driver.findElement(By.className("aOOlW")).click();
//		driver.findElement(By.name("username")).sendKeys("0833956169");
//		driver.findElement(By.name("password")).sendKeys("Aniket");
//		driver.findElement(By.className("Igw0E")).click();
//		driver.close();	
		
		//facebook
//		driver.get("https://facebook.com");
//		driver.findElement(By.cssSelector("button[data-cookiebanner=accept_button]")).click();
//		driver.findElement(By.id("email")).sendKeys("aniketshinde");
//		driver.findElement(By.id("pass")).sendKeys("anisadket");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
//		driver.findElement(By.xpath("//div[@class = '_9ay7']")).getText();
//		
		
		//facebook with css
//		driver.get("https://facebook.com");
//		driver.findElement(By.cssSelector("button[data-cookiebanner=accept_button]")).click();
//		driver.findElement(By.cssSelector("input[name ='email']")).sendKeys("abc");
//		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("123");
//		
		//rediff
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("ANiiet");
//		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("1234");
//		driver.findElement(By.cssSelector("input.signinbtn")).click();
//		
		
		//google
//		driver.get("https://google.com");
//		driver.findElement(By.xpath("//div[@class = 'VDity']/button[2]/div")).click();
//		
//		driver.findElement(By.xpath("//div[@jsname='vdLsw']/following-sibling::input")).sendKeys("Good Morning");
//		driver.findElement(By.xpath("//center/input[@class='gNO89b']")).click();
	}

}
