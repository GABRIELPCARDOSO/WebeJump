package br.com.test.core;

import static br.com.test.core.DriverFactory.getDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.test.core.Propriedades.Browsers;




public class BasePage {
public static Browsers browser = Browsers.FIREFOX;
	
	
			/********* TextField e TextArea 
			 * @return ************/
			
			
			public String EscreverEObterValor(String id_campo, String texto) {
				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_campo)));
				getDriver().findElement(By.id(id_campo)).sendKeys(texto);
				return getDriver().findElement(By.id(id_campo)).getAttribute("value");
			}
		
			/********* Radio e Check ************/
			
			public void clicarBotao(String id) {
				getDriver().findElement(By.id(id)).click();
			}
	
			
			/********* Botao ************/
			
			
			public void verificarAusencia(String id) {
				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
				
			}
			public void verificarElementoVisivel(String xpath) {
				WebDriverWait wait = new WebDriverWait(getDriver(), 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
				
			}
			
			public void frame() {
			getDriver().switchTo().frame(0);
			
			}
			
			/********* Textos ************/
			
			
			public String clicarEObterValorPorId(String id_campo){
				getDriver().findElement(By.id(id_campo)).click();
				Alert alert = getDriver().switchTo().alert();
				String valor = alert.getText();
				alert.accept();
				return valor;
			
			}
			
			public boolean isCheckMarcado(String id){
				getDriver().findElement(By.id(id)).click();
				return getDriver().findElement(By.id(id)).isSelected();
			}
			
			public String selecionarCombo(String id, String valor) {
				WebElement element = getDriver().findElement(By.id(id));
				Select combo = new Select(element);
				combo.selectByVisibleText(valor);
				return combo.getFirstSelectedOption().getText();
			}
			
			
			/********* JS ***********/
			
			public Object executarJS(String cmd, Object... param) {
				JavascriptExecutor js = (JavascriptExecutor) getDriver();
				return js.executeScript(cmd, param);
			}
			
			public void localizarElementoViaJsX(String id) {
				WebElement frame = getDriver().findElement(By.id(id));
				executarJS("window.scrollBy(0, arguments[0])", frame.getLocation().y);
			
			}
			
			public void localizarElementoViaJsXpath(String xpath) {
				WebElement frame = getDriver().findElement(By.xpath(xpath));
				executarJS("window.scrollBy(0, arguments[0])", frame.getLocation().y);	
		}
	}
