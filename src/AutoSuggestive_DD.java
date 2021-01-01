import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("th");
	Thread.sleep(2000);
	
	//System.out.println(driver.findElement(By.id("twotabsearchtextbox")).getText());

	//Javascript DOM can extract hidden elements
	//because selenium cannot identify hidden elements - (Ajax implementation)
	//investigate the properties of object if it have any hidden text

	//JavascriptExecutor
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	String script = "return document.getElementById(\"twotabsearchtextbox\").value;";
	String text=(String) js.executeScript(script);
	System.out.println(text);
	int i=0;
	
	while(!text.equalsIgnoreCase("thermal paste"))
	{
		i++;
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.DOWN);
		text=(String) js.executeScript(script);
		System.out.println(text);
		
		if(i>7)
		{
			break;	
		
		}	
	}
	
	if(i>7)
	{
		System.out.println("Test Fail");
	}
		else
		{
			System.out.println("Test Pass");
		}
		
	
	

	}

}
