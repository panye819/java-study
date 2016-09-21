package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		WebDriverWait myWaitVar = new WebDriverWait(driver,10);
		String baseUrl = "https://facebook.com";
		String tagName = "";
		String alertMessage = "";
		
//		driver.get(baseUrl);
//		tagName = driver.findElement(By.id("email")).getTagName();
//		System.out.println(tagName);
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.close();
//		System.exit(0);
		driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        driver.quit();
		
	}
}

