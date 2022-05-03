package br.com.test.teste;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.test.pages.WebJump;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Cenario2 {
	
	private WebJump pageWebj = new WebJump();
	
	@Test
	public void clicarBotoesIframe() throws InterruptedException {
		pageWebj.localizarElementoViaJsX("iframe_panel_body");
		pageWebj.frame();
		pageWebj.clicarOne();
		pageWebj.clicarTwo();
		pageWebj.clicarFour();
	}
	
	@Test
	public void verificarAusenciaBotoesIframe() {

		pageWebj.verificarAusenciaBtnOne();
		pageWebj.verificarAusenciaBtnTwo();
		pageWebj.verificarAusenciaBtnThree();
	}
}
