package br.com.test.suites;

import static br.com.test.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.test.core.DriverFactory;
import br.com.test.pages.LoginPage;
import br.com.test.teste.Cenario1;
import br.com.test.teste.Cenario2;
import br.com.test.teste.Cenario3;

@RunWith(Suite.class)
@SuiteClasses({
	Cenario1.class,
	Cenario2.class,
	Cenario3.class
	})

public class SuiteGeral {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa() {
		page.acessarTelaInicial();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}
}
