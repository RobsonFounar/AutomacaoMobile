package br.com.ideamaker.teste;

import java.net.MalformedURLException;

import br.com.ideamaker.config.Config;
import br.com.ideamaker.core.AppiumDriverHelper;
import br.com.ideamaker.mock.PaginaCompra;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTeste {

	PaginaCompra pagina;

	@Given("Estando com o Celular quero baixar e abrir o APP")
	public void estando_com_o_celular_quero_baixar_e_abrir_o_app() throws MalformedURLException {
		pagina = new PaginaCompra(AppiumDriverHelper.createDriver(Config.getPlatform(), Config.getConfigSistema()));
		 
		pagina.ent_cadastrado();
	}

	@When("Abrir o APP colocar meu CPF e Senha") 
	public void abrir_o_app_colocar_meu_cpf_e_senha() throws InterruptedException {
		   
		pagina.log_cpf("430951158901994");
		pagina.log_erro();
		pagina.log_senha("1994");
		pagina.bot_entrar();
		pagina.guia_naoprecisa();
		pagina.compraPraMim();
		
	}

	@Then("validando tudo eu fecho os app")
	public void validando_tudo_eu_fecho_os_app() {
	    
	}
}