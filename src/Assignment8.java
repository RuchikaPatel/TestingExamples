import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		
		int i=0;
		while(!text.equalsIgnoreCase("United Kingdom (UK)"))
		{
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
			
		}
		
		if(i>10) 
		{
			System.out.println("Test Fail");
		}
		else
		{
			System.out.println("");
			System.out.println("The text present: "+text);
			System.out.println("Test Pass");
		}
	}

}
