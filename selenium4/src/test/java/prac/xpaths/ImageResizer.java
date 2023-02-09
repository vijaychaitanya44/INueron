package prac.xpaths;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import customUtility.Utility;

public class ImageResizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://imageresizer.com/");
		Utility.waitForSeconds(5);
		
		driver.findElement(By.xpath("//div[@data-testid='device-upload-direct']")).sendKeys("C:\\\\Users\\\\vijay\\\\Downloads\\\\illustration.png");
		
		

	}

}
