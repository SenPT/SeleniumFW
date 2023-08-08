package testcase;

import org.openqa.selenium.By;
import base.BaseTest;


public class MyFirstTest extends BaseTest{

	public static void main(String[] args) {
		driver.findElement(By.linkText(lop.getProperty("signin_link"))).click();
		driver.findElement(By.id(lop.getProperty("firstname_field"))).sendKeys("Sen");
		driver.findElement(By.id(lop.getProperty("lastname_field"))).sendKeys("Phan");
		driver.findElement(By.id(lop.getProperty("email_field"))).sendKeys("phanthisen51195@gmail.com");
		driver.findElement(By.id(lop.getProperty("password_field"))).sendKeys("12345678");
	}
}
