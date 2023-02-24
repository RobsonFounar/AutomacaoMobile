package br.com.ideamaker.mock;

import br.com.ideamaker.mapeamento.BancoDados;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PaginaCompra extends BancoDados {

	public PaginaCompra(AppiumDriver<MobileElement> appiumDriver) {
		super(appiumDriver);
	}

	public void ent_naocadastradoo() {
		ent_naocadastrado.click();
	}

	public void ent_cadastrado() {
		ent_cadastrado.click();
	}

	public void log_cpf(String value) {
		log_cpf.clear();
		log_cpf.sendKeys(value);
	}

	public void log_erro() {
		log_erro.click();
	}

	public void log_senha(String value) {
		log_senha.clear();
		log_senha.sendKeys(value);
	}

	public void bot_entrar() {
		log_bot_entrar.click();
	}

	public void guia_naoprecisa() {
		guia_naopreciso.click();
	}

	public void compraPraMim() {
		pag_compra_mim.click();
	}

}
