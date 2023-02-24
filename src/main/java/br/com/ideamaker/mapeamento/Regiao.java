package br.com.ideamaker.mapeamento;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Regiao {

	//private AppiumDriver<MobileElement> driver;

	public Regiao(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		//this.driver = appiumDriver;
	}

	@AndroidFindBy(id = "com.ideamaker.centrooeste:id/checkableETextInputEditText")
	@iOSXCUITFindBy(xpath = "com.ideamaker.centrooeste:id/checkableETextInputEditText")
	private MobileElement cpf;

	@AndroidFindBy(xpath = "")
	@iOSXCUITFindBy(xpath = "")
	private MobileElement senha;
	
	@AndroidFindBy(xpath = "com.ideamaker.centrooeste:id/progressButtonTextView")
	@iOSXCUITFindBy(xpath = "com.ideamaker.centrooeste:id/progressButtonTextView")
	private MobileElement entrar;
}