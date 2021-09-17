package ru.mail.test;

import org.junit.jupiter.api.Test;
import ru.mail.pageobject.ru.mail.MailPage;
import ru.mail.pageobject.ru.mail.MainPage;
import ru.mail.pageobject.ru.mail.NewMailPopUp;
import selenium.webdriver.WebDriverSettings;

/**
 * @author Fil Lost
 * @since 17.09.2021
 */
public class SendMail extends WebDriverSettings {

	private static final String login = "t_acc_ql\n";
	private static final String password = "Ax4-EDw-9b4-nXC\n";

	private static final String address = "as0509@ya.ru";
	private static final String bodyMail = "" +
			"<Nub> Кто-нибудь может объяснить, как делятся клетки?\n" +
			"<K4rli> o\n" +
			"<K4rli> 0\n" +
			"<K4rli> 8\n" +
			"<K4rli> oo";

	@Test
	public void sendMail() {

		chromeDriver.get("https://mail.ru/");

		MainPage mainPage = new MainPage(chromeDriver);
		mainPage.login(login,password);

		MailPage mailPage = new MailPage(chromeDriver);
		mailPage.clickNewMailButton();

		NewMailPopUp messageWindow = new NewMailPopUp(chromeDriver);
		messageWindow.sendMail(address,bodyMail);

		System.out.println("Тест успешен. Проверок по условию не требовалось)");
	}



}
