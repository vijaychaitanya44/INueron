package calendarcontrols;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalendar4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.findElement(By.id("datepicker")).click();

		for (int i = 0; i < 12; i++) {
			String month = driver.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
			String year = driver.findElement(By.xpath("//span[contains(@class,'year')]")).getText();

			if (month.contains("August") && year.contains("2023")) {
				System.out.println("Its true");
				List<WebElement> dates = driver
						.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
				for (WebElement ele : dates) {
					if (ele.getText().contains("15")) {
						ele.click();
						break;
					}
				}
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();

			}
		}

//		
//		for(WebElement ele: dates) {
//			//System.out.println(ele.getText());
//			
//			if(ele.getText().contains("26")) {
//				ele.click();
//				break;
//			}
//		}
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.id("datepicker")).getText());
//		System.out.println(driver.findElement(By.id("datepicker")).getAttribute("value"));
	}

}
