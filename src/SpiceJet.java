import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aircanada.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='enCAEdition']")).click();
		

		WebElement passenger = driver.findElement(By.xpath("//div[@id='passengersInputField']"));
		passenger.click();
		
//		int i=1;
//		while(i<5)
//		{
//		    driver.findElement(By.xpath("//button[@id='btnYouthCountAdd']")).click();
//		    i++;
//		}
		
		for(int i=0;i<5;i++)
		{
			driver.findElement(By.xpath("//button[@id='btnYouthCountAdd']")).click();
		}
		
	}

}
