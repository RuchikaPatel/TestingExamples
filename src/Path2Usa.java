import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path2Usa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']"))
				.getText().contains("August")) {
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> count =driver.findElements(By.cssSelector("td[class='day']"));
		for(int i=0;1<count.size();i++)
		{
			String date = driver.findElements(By.cssSelector("td[class='day']")).get(i).getText();
			if(date.contains("23"))
			{
				driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
				break;
			}
		}
	}

}
