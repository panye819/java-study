package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.baidu.com";
		String expectTitle = "百度一下";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		
		
		if (actualTitle.contentEquals(expectTitle)){
			System.out.println("Test Passed!");
			System.out.println(actualTitle);
		}else{
			System.out.println("Test Failed!");
			System.out.println(actualTitle);
		}
		driver.close();
		
		System.exit(0);
	}

}
