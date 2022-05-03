package br.com.test.teste;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.test.pages.WebJump;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Cenario1 {
	
	private WebJump pageWebj = new WebJump();
	
	@Test
	public void clicarBotoes() {
		pageWebj.clicarOne();
		pageWebj.clicarTwo();
		pageWebj.clicarFour();
	}
	
	@Test
	public void verificarAusenciaBotoes() {
		pageWebj.verificarAusenciaBtnOne();
		pageWebj.verificarAusenciaBtnTwo();
		pageWebj.verificarAusenciaBtnThree();
	}
}
