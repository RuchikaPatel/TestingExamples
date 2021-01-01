import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");

		driver.findElement(By.cssSelector("input[id='OneWay']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id='OneWay']")).isSelected());
		driver.findElement(By.cssSelector("input[id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("4");
		
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByValue("3");
				
		
		Select infants = new Select(driver.findElement(By.id("Infants")));
		infants.selectByValue("1");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		driver.findElement(By.xpath("//a[@title='More search options']")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		
		
	}

}
