package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\eclipse-workspace\\Nothink\\driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
    driver.get("https://adactinhotelapp.com/");
    
    WebElement findElement = driver.findElement(By.xpath("//p[contains(text(),'Ada')]"));
    String text = findElement.getText();
    System.out.println(text);
    
    
	}

}
