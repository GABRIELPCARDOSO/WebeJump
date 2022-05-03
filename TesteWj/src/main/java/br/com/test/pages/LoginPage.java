package br.com.test.pages;

import br.com.test.core.BasePage;
import br.com.test.core.DriverFactory;

public class LoginPage extends BasePage {
		
		public void acessarTelaInicial() {
			DriverFactory.getDriver().get("https://wj-qa-automation-test.github.io/qa-test/");
		}
}
