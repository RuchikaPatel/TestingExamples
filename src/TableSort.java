import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> colList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> orgList = new ArrayList<String>();
		for(int i=0;i<colList.size();i++)
		{
			orgList.add((colList.get(i).getText()));
		}

		ArrayList<String> copyList = new ArrayList<String>();
		for(int i=0;i<orgList.size();i++)
		{
			copyList.add((orgList.get(i)));
		}
		
		Collections.sort(copyList);
		for(int i=0;i<copyList.size();i++)
		{
			System.out.println(copyList.get(i));
		}
		
		System.out.println("*******************************************");	
		
		for(int i=0;i<orgList.size();i++)
		{
			System.out.println(orgList.get(i));
		}
		
		System.out.println("*******************************************");	
		
//		if(orgList.equals(copyList))
//		{
//			System.out.println("Test Pass");
//		}
//		else
//		{
//			System.out.println("Test Fail");
//		}
		
		Assert.assertTrue(orgList.equals(copyList));
	}

}
