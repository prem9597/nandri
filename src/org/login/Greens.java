package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91959\\eclipse-workspace\\Nothink\\driver\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
    
    WebElement findElement = driver.findElement(By.xpath("(//li[@class='nav-item'])[3]"));
    findElement.click();
    Thread.sleep(5000);
    WebElement findElement1 = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
   String text = findElement1.getText();
    System.out.println(text);
	}

}
 