package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demo3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		
		String baseUrl = "https://www.baidu.com";
		String baseUrl2 = "http://www.taobao.com";
		
//		dr.get(baseUrl);
//		dr.findElement(By.id("kw")).sendKeys("selenium");
//		dr.findElement(By.id("su")).click();
//		Thread.sleep(10000);
//		dr.close();
//		System.exit(0);
		
		dr.get(baseUrl2);
		dr.findElement(By.id("q")).sendKeys("selenium");
		dr.findElement(By.className("btn-search")).click();
		Thread.sleep(10000);
		dr.close();
		System.exit(0);

	}

}
