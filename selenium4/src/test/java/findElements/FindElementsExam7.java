package findElements;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExam7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		Thread.sleep(2000);
		
		List<WebElement> lOptions= driver.findElements(By.xpath("//div[@role='option']"));
		
		
		for(WebElement ele:lOptions) {
			System.out.println(ele.getText());
			
			if(ele.getText().contains("github")) {
				ele.click();
				//break;
			}
		}
	}
}

