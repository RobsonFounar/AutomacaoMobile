package br.com.ideamaker.mapeamento;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Cadastro {

	//private AppiumDriver<MobileElement> driver;

	public Cadastro(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		//this.driver = appiumDriver;
	}

	@AndroidFindBy(id = "Código")
	@iOSXCUITFindBy(id = "Código")
	private MobileElement campo_codigo;

	@AndroidFindBy(id = "Aluno")
	@iOSXCUITFindBy(id = "Aluno")
	private MobileElement campo_aluno;
	
	@AndroidFindBy(id = "salvar")
	@iOSXCUITFindBy(id = "salvar")
	private MobileElement botao_salvar;
}