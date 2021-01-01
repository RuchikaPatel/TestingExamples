import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String label = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(label);
		System.out.println(driver.findElement(By.id("checkBoxOption2")).isSelected());
		  
		
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(label);
		
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertMsg = driver.switchTo().alert().getText();
		if(alertMsg.contains(label))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
	}

}
