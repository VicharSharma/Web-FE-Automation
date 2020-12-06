import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserTest {
	public static void main(String[] args) throws Throwable{
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sony vaio i5")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Dell i7 8gb")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[4]/a[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vichar Sharma");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Gurugram");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("20");
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).sendKeys("Vichar Sharma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
