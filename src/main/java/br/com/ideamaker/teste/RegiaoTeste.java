package br.com.ideamaker.teste;

import java.net.MalformedURLException;

import br.com.ideamaker.config.Config;
import br.com.ideamaker.core.AppiumDriverHelper;
import br.com.ideamaker.mapeamento.Regiao;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegiaoTeste {

	Regiao pagina;

	@Given("Estando com o Celular quero baixar e abrir o APPxx")
	public void estando_com_o_celular_quero_baixar_e_abrir_o_app() throws MalformedURLException {
		pagina = new Regiao(AppiumDriverHelper.createDriver(Config.getPlatform(), Config.getConfigSistema()));

		pagina.cpf("430951158901994");
		pagina.entrar();
	}

	@When("Dentro do APP quero Comprar ver titulos e mandar CAPsxx")
	public void dentro_do_app_quero_comprar_ver_titulos_e_mandar_ca_ps() {

	}

	@Then("validando tudo eu fecho os appxx")
	public void validando_tudo_eu_fecho_os_app() {

	}
}