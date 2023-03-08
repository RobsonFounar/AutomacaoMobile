package br.com.ideamaker.mapeamento;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Login {

	// private AppiumDriver<MobileElement> driver;

	public Login(AppiumDriver<MobileElement> appiumDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
		// this.driver = appiumDriver;
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]\n")
	@iOSXCUITFindBy(id = "email")
	private MobileElement campo_campinas;
	
	@AndroidFindBy(id = "cpf")
	@iOSXCUITFindBy(id = "cpf")
	private MobileElement campo_cpf;

	@AndroidFindBy(id = "senha")
	@iOSXCUITFindBy(id = "senha")
	private MobileElement campo_senha;

	@AndroidFindBy(id = "entrar")
	@iOSXCUITFindBy(id = "entrar")
	private MobileElement botao_entrar;

	// Ação em Metodos
	public void compocampinas()  {
		campo_campinas.click();
		
	}

	public void campoCpf(String  cpff) {
		
		campo_cpf.sendKeys(cpff);
		
		
	}
	public void campoSenha(String pass) {
		campo_senha.click();
		campo_senha.sendKeys(pass);
	}

	public void botaoEntrar() {
		campo_senha.click();
		
	}

}
