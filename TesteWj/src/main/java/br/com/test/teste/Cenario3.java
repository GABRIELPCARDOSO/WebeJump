package br.com.test.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.test.pages.LoginPage;
import br.com.test.pages.WebJump;

public class Cenario3 {

@Before
public void entrarPagina() {
	pageLoge.acessarTelaInicial();
}
	
	private WebJump pageWebj = new WebJump();
	private LoginPage pageLoge = new LoginPage();
	
	@Test
	public void escreverNomeEChecarBotoes() {
		assertEquals("Gabriel", pageWebj.escreverNomeUsuario("Gabriel"));
		pageWebj.clicarOne();
		assertTrue(pageWebj.marcarOptionThree());
		assertEquals("ExampleTwo", pageWebj.selecionarOpcao("ExampleTwo"));
		pageWebj.verificarImgSelenium();
	}
}
