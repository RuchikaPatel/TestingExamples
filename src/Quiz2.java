import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Quiz2 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		//Assert.assertFalse(driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
	// to count the number of checkbox present on a website
		// find out the common locator
			//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
			

	}

}
