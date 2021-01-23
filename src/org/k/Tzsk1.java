package org.k;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tzsk1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\riyaz\\eclipse-w\\Z'\\driver\\chromedriver.exe");
	 WebDriver ame = new ChromeDriver();
	 ame.get("https://www.guru99.com/");
	 ame.manage().window().maximize(); 
	 List<WebElement> list = ame.findElements(By.xpath("((//b[text()='Must Learn!']//parent::h4//parent::div//parent::div)[1]//preceding-sibling::div)//div//h4//b"));
for (WebElement webElement : list) {
	System.out.println(webElement.getText());
}
}
}
