import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New')]")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening')]")).getText());
	}

}
