package br.com.ideamaker.teste;

import java.net.MalformedURLException;
import br.com.ideamaker.config.Config;
import br.com.ideamaker.core.AppiumDriverHelper;
import br.com.ideamaker.mapeamento.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class LoginTeste {

	public static void main(String[] args) {

		Login pagina;

	@Given("Estando com o Celular quero baixar e abrir o APP")
	public void estando_com_o_celular_quero_baixar_e_abrir_o_app() throws MalformedURLException {
		pagina = new Login(AppiumDriverHelper.createDriver(Config.getPlatform(), Config.getConfigSistema()));

		
		try {
			pagina.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// pagina.ent_cadastrado();
	}

	@When("Abrir o APP colocar meu CPF e Senha")
	public void abrir_o_app_colocar_meu_cpf_e_senha() throws InterruptedException {

		pagina.wait(50000);
		pagina.compocampinas();
		pagina.wait(300);
		pagina.campoCpf("31788925831");
		pagina.wait(300);
		pagina.campoSenha("1994");
		pagina.wait(300);
		pagina.botaoEntrar();
	}

	@Then("validando tudo eu fecho os app")
	public void validando_tudo_eu_fecho_os_app() {

	}
}