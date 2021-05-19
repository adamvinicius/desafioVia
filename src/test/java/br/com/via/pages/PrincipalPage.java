package br.com.via.pages;

import br.com.via.core.Element;
import br.com.via.enums.ByValue;
import br.com.via.maps.PrincipalMap;

public class PrincipalPage {

	PrincipalMap principalMap = new PrincipalMap();
	
	public String getHome() {
		return principalMap.txtCabecalho.getText();
	}
	
	public PrincipalPage clickMenu(String menu) {
		Element aPesquisaQA = new Element(ByValue.xpath, "//a[text() = '"+menu+"']");
		aPesquisaQA.click();
		return this;
	}
	
	public PrincipalPage setInpNome(String nome) {
		principalMap.inpNome.sendKeys(nome);
		return this;
	}
	
	public PrincipalPage setSobreNome(String sobrenome) {
		principalMap.inpSobreNome.sendKeys(sobrenome);
		return this;
	}
	
	public PrincipalPage setEmail(String email) {
		principalMap.inpEmail.sendKeys(email);
		return this;
	}
	
	public PrincipalPage setEmailConfirmacao(String email) {
		principalMap.inpEmailConfirm.sendKeys(email);
		return this;
	}
	
	public PrincipalPage clickIdade() {
		principalMap.radIdade.click();
		return this;
	}
	
	public PrincipalPage slcTempoArea(String tempo) {
		principalMap.slcTempoArea.selectText(tempo);
		return this;
	}
	
	public PrincipalPage slcAtraiu(String motivo) {
		principalMap.slcAtraiu.selectText(motivo);
		return this;
	}
	
	public PrincipalPage clickRadMelhoria() {
		principalMap.radMelhoria.click();
		return this;
	}
	
	public PrincipalPage setLinguagem(String linguagem) {
		principalMap.inpLinguagem.sendKeys(linguagem);
		return this;
	}
	
	public PrincipalPage clickEnviar() {
		principalMap.inpEnviar.click();
		return this;
	}
	
	public String getSucesso() {
		return principalMap.pSucesso.visibilityOf().getText();
	}
	
	
	
	
}
