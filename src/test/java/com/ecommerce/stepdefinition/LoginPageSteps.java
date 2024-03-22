package com.ecommerce.stepdefinition;

import org.testng.Assert;

import com.ecommerce.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		DriverFactory.getDriver().get("http://www.automationpractice.pl/index.php");
		
	}
	
	@Given("user click on Signin button")
	public void user_click_on_Signin_button() {
		loginPage.clickSignInlink();
		
	}

	@When("user gets the title of the Landing page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLandingPageTitle();
		System.out.println("login page title is: " + title);
		
	}

	@Then("Login page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		String loginPageTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(loginPageTitle,expectedTitleName);
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());

}
	

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   
		loginPage.enterUserName(username);
	    
	}


	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginButton();   
	}

	@Then("Home page title should be {string}")
	public void user_gets_the_title_of_the_home_page(String expectedHomePageTitle) {
		String homePageTitle = loginPage.getHomePageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle,expectedHomePageTitle);
	}




}
