package calendarcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		
		
		for(WebElement ele: dates) {
			//System.out.println(ele.getText());
			
			if(ele.getText().contains("26")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("datepicker")).getText());
		System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));
	}

}
