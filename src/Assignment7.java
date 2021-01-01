import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int rowCount = table.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println("The row count is: "+rowCount);
		int columnCount = table.findElements(By.xpath("//table[@id='product']//tr//th")).size();
		System.out.println("The Column Count is: "+columnCount);
		System.out.println("The Data of 2 Row: "+table.findElement(By.xpath("//table[@id='product']//tr/following-sibling::tr[2]")).getText());

	}

}
