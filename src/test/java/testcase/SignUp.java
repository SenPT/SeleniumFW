package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class SignUp extends BaseTest{
	
	@Test
	public void LogupTest() throws InterruptedException {
		driver.findElement(By.linkText(lop.getProperty("signup_link"))).click();
		driver.findElement(By.id(lop.getProperty("firstname_field"))).sendKeys("Sen");
		driver.findElement(By.id(lop.getProperty("lastname_field"))).sendKeys("Phan");
		driver.findElement(By.id(lop.getProperty("email_field"))).sendKeys("phanthisen51195@gmail.com");
		driver.findElement(By.id(lop.getProperty("password_field"))).sendKeys("S12345678");
		driver.findElement(By.id(lop.getProperty("createaccount_button"))).click();
		Thread.sleep(2000);
	}
	
}
