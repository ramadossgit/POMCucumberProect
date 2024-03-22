package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// By Locators
	private By signIn = By.linkText("Sign in");
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?111");
	
	
	/*
	 * This constructor is to initialize driver
	 * @param WebDriver
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	/*
	 * The below methods are used to do actions in the web pages
	 */
	
	public String getLandingPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void clickSignInlink() {
		driver.findElement(signIn).click();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton() {
		driver.findElement(signInButton).click();
	}
	
}
