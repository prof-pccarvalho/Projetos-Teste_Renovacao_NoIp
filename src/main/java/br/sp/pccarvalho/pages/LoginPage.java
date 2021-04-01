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
	
	public void clicarPainelHosts() {
		
		clicarBotao(By.xpath("//span[normalize-space()='DNS Dinâmico']"));////*[@id="main-menu-inner"]/ul/li[2]/a/span
	}
	
	public void clicarHosts() {
		
		clicarBotao(By.xpath("//*[@id=\"host-panel\"]/table/tbody/tr[1]/td[1]/a"));////*[@id="main-menu-inner"]/ul/li[2]/a/span
	}
	
	
	//*[@id="host-panel"]/table/tbody/tr[1]/td[1]/a

}
