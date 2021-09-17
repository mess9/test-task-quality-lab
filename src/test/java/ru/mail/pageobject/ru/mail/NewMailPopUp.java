package ru.mail.pageobject.ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class NewMailPopUp {

	private WebDriver chromeDriver;

	private WebElement addressField;
	private WebElement mailBodyField;
	private WebElement sendButton;

	public NewMailPopUp(WebDriver chromeDriver){
		this.chromeDriver = chromeDriver;
		addressField = chromeDriver.findElement(By.xpath("//div[contains(@class,'inputContainer')]/input"));
		mailBodyField = chromeDriver.findElement(By.xpath("//div[contains(@class,'editable-container')]/div/div[1]"));
		sendButton = chromeDriver.findElement(By.xpath("//span[contains(@class,'button') and text()='Отправить']"));
	}

	public void sendMail(String address, String body){
		addressField.click();
		addressField.sendKeys(address);
		mailBodyField.click();
		mailBodyField.sendKeys(body);
		sendButton.click();
	}

}
