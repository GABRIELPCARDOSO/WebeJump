package br.com.test.core;

import static br.com.test.core.DriverFactory.getDriver;
import static br.com.test.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.test.pages.LoginPage;

public class BaseTest {
	
	/*
	 * private LoginPage page = new LoginPage();
	 */
	@Rule
	public TestName testName = new TestName();
	
	/*
	 * @Before public void inicializa() { page.acessarTelaInicial();
	 * page.logar("demo", "carloscpm25@gmail.com", "carlos11"); 
	 * }
	 */
	
	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("D:" + File.separator + "eclipse-workspace" + File.separator + "DocZ" + File.separator + "target" + File.separator + "screenshot" + File.separator +
				testName.getMethodName() + ".jpg"));
		/*
		 * if(Propriedades.FECHAR_BROWSER) { killDriver(); }
		 */
	}
}
