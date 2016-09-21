package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		String baseUrl = "https://auth.anquanyi.com/uaa/login";
		//Actions action = new Actions(dr);
	
		dr.get(baseUrl);
		dr.findElement(By.name("username")).sendKeys("panye819");
		dr.findElement(By.name("password")).sendKeys("111111");
		dr.findElement(By.className("btn")).click();
		dr.close();
		System.exit(0);
		
	}

}
