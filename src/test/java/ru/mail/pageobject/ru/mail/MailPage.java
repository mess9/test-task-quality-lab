package ru.mail.pageobject.ru.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class MailPage {

	private WebDriver chromeDriver;

	private WebElement newMailbutton;


	public MailPage(WebDriver chromeDriver){
		this.chromeDriver = chromeDriver;
		newMailbutton = chromeDriver.findElement(By.xpath("//span[@class='compose-button__txt']"));
	}

	public void clickNewMailButton(){
		newMailbutton.click();
	}


}
