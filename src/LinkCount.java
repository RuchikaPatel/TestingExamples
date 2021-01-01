import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//1. This will count the all link present on a webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Links present in a footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. Link Count for a particular section
		WebElement Columndriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']//ul[1]"));
		System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link in the column and verify if it opening in a new tab
		for(int i=0;i<Columndriver.findElements(By.tagName("a")).size();i++)

		{
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			Thread.sleep(3000);
			
		}
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
