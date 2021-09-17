package ru.mail.pageobject.ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class MainPage {

	private WebDriver chromeDriver;
	private WebElement loginField;
	private WebElement passwordField;

	public MainPage(WebDriver chromeDriver){
		this.chromeDriver = chromeDriver;
		loginField = chromeDriver.findElement(By.xpath("//input[@name='login']"));
		passwordField = chromeDriver.findElement(By.xpath("//input[@name='password']"));
	}

	public void login(String login, String password) {
		loginField.click();
		loginField.sendKeys(login);
		passwordField.click();
		passwordField.sendKeys(password);
	}

}
