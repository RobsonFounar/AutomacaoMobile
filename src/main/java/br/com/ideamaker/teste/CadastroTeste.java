package br.com.ideamaker.teste;

import java.net.MalformedURLException;

import br.com.ideamaker.config.Config;
import br.com.ideamaker.core.AppiumDriverHelper;
import br.com.ideamaker.mapeamento.Cadastro;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroTeste {

	Cadastro pagina;

	@Given("Estando com o Celular quero baixar e abrir o APPx")
	public void estando_com_o_celular_quero_baixar_e_abrir_o_app() throws MalformedURLException {
		pagina = new Cadastro(AppiumDriverHelper.createDriver(Config.getPlatform(), Config.getConfigSistema()));

		pagina.setAluno("Robson");
		pagina.setCodigo("1235");
		
	}

	@When("Dentro do APP quero Comprar ver titulos e mandar CAPsx")
	public void dentro_do_app_quero_comprar_ver_titulos_e_mandar_ca_ps() {
		pagina.clicarSalvar();
	}

	@Then("validando tudo eu fecho os appx")
	public void validando_tudo_eu_fecho_os_app() {

	}
}