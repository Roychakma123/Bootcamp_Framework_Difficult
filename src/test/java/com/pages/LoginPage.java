package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement enterLoginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail() {
		emailField.sendKeys("Rolyda1@yahoo.com");
	}
	public void enterPassword() {
		passwordField.sendKeys("Ayana123");
	}
	public AccountPage loginButton() {
		enterLoginButton.submit();
		return new AccountPage(driver);
	}

}
