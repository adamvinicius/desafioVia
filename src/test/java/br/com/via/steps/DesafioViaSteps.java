package br.com.via.steps;

import static org.junit.Assert.assertEquals;

import br.com.via.core.Driver;
import br.com.via.pages.PrincipalPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class DesafioViaSteps {

	private PrincipalPage principalPage = new PrincipalPage();
	
	@Dado("que esteja na pagina {string}")
	public void queEstejaNaPagina(String url) {
		Driver.abreNavegador();
		Driver.driver.get(url);
	}

	@Dado("que eu acesse a página da VV Test")
	public void queEuAcesseAPáginaDaVVTest() {
		assertEquals(principalPage.getHome(), "VV Test");
	}

	@Dado("acesse o menu {string}")
	public void acesseOMenu(String menu) {
		principalPage.clickMenu(menu);
	}

	@Quando("eu preencher todos os campos obrigatorios")
	public void euPreencherTodosOsCamposObrigatorios() {
		principalPage.setInpNome("Adam Vinicius")
		.setSobreNome("Cezar Luchini")
		.setEmail("adamvinicius@gmail.com")
		.setEmailConfirmacao("adamvinicius@gmail.com")
		.clickIdade()
		.slcTempoArea("mais de 5 anos")
		.slcAtraiu("Desafio")
		.clickRadMelhoria()
		.setLinguagem("Java")
		.clickEnviar();
	}

	@Entao("deve ser direcionado para uma pagina de sucesso")
	public void deveSerDirecionadoParaUmaPaginaDeSucesso() {
		assertEquals(principalPage.getSucesso(), "Your form has been successfully submitted.");
	}

}
