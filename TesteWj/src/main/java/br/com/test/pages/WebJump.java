package br.com.test.pages;

import br.com.test.core.BasePage;

public class WebJump extends BasePage {
	
	public void clicarOne() {
		clicarBotao("btn_one");
	}
	
	public void clicarTwo() {
		clicarBotao("btn_two");
	}
	
	public void clicarFour() {
		clicarBotao("btn_link");
	}
	
	public void verificarAusenciaBtnOne() {
		verificarAusencia("btn_one");
	}
	
	public void verificarAusenciaBtnTwo() {
		verificarAusencia("btn_two");
	}
	
	public void verificarAusenciaBtnThree() {
		verificarAusencia("btn_link");
	}

	public String escreverNomeUsuario(String usuario) {
		return EscreverEObterValor("first_name", "Gabriel");
	}
	
	public boolean marcarOptionThree() {
		return isCheckMarcado("opt_three");
	}
	
	public boolean marcarBotao() {
		return isCheckMarcado("opt_three");
	}
	
	public String selecionarOpcao(String opcao) {
		return selecionarCombo("select_box", opcao);
	}
	
	public void verificarImgSelenium() {
		verificarElementoVisivel("//img[contains(@alt,'selenium')]");
	}
	
}
