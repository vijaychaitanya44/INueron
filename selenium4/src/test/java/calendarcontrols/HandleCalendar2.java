package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		//moving to next month
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		//selecting the Feb month 02/27/2023
		driver.findElement(By.xpath("//a[text()='27']")).click();
		
	}

}
