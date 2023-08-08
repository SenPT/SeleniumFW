package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;


public class SignIn extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class, dataProvider="bvtdata")
	public void SignInTest(String username, String password) throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.linkText(lop.getProperty("signin_link"))).click();
		driver.findElement(By.id(lop.getProperty("username_field"))).sendKeys(username);
		driver.findElement(By.id(lop.getProperty("signincontinue_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.id(lop.getProperty("signinpass_field"))).sendKeys(password);
		driver.findElement(By.id(lop.getProperty("signin_button"))).click();
		Thread.sleep(4000);
	}
}
