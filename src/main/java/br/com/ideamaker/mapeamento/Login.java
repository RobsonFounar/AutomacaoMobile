package br.com.ideamaker.mapeamento;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login {

	//private AppiumDriver<MobileElement> driver;

	public Login(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		//this.driver = appiumDriver;
	}

	@AndroidFindBy(xpath = "email")
	@iOSXCUITFindBy(id = "email")
	private MobileElement campo_login;

	@AndroidFindBy(id = "senha")
	@iOSXCUITFindBy(id = "senha")
	private MobileElement campo_senha;

	@AndroidFindBy(id = "entrar")
	@iOSXCUITFindBy(id = "entrar")
	private MobileElement botao_entrar;
}