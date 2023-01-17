package webdriverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver(); {
			
			
			driver.get("https://www.facebook.com");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			driver.findElement(By.name("firstname")).sendKeys("Apple");
			driver.findElement(By.name("lastname")).sendKeys("Sunday");
			
			driver.findElement(By.name("reg_email__")).sendKeys("apple.sunday@sun.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("apple.sunday@sun.com");
			driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Sunday1234#");
			
		WebElement	 dateList = driver.findElement(By.cssSelector("select[title='Day']"));
		
		Select dl = new Select(dateList);
		dl.selectByValue("24");
		WebElement monList = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select ml= new Select(monList);
		ml.selectByVisibleText("Nov");
		
		WebElement yearList = driver.findElement(By.xpath("//select[@title='Year']"));
		Select yl = new Select(yearList);
		yl.selectByValue("1990");
		System.out.println(ml.getFirstSelectedOption().getText());
		
	
		
			
		}
	}

}
