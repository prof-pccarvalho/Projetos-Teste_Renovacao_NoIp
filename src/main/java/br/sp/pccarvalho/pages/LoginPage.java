package br.sp.pccarvalho.pages;



import org.openqa.selenium.By;

import br.sp.pccarvalho.core.BasePage;
import br.sp.pccarvalho.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.noip.com/login");
	}
	
	public void setEmail(String id_campo, String email) {
		escrever("Username", email);
	}
	
	public void setSenha(String id_campo, String senha) {
		escrever("password", senha);
	}
	
	public void entrar() {
		clicarBotaoporTexto("Entrar");
	}
	
	public void logar(String email, String senha) {
		setEmail("username",email);
		setSenha("password",senha);
		entrar();
	}
	
	public void escreverTexto(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto);
	
	//public void escreverTexto(By by) {
	//	DriverFactory.getDriver().findElement(by);
	}
	
	public void clicarLogin() {
		clicarBotao(By.xpath("//*[@id=\"clogs\"]/button"));
	}

}
