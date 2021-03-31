package br.sp.pccarvalho.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import br.sp.pccarvalho.core.BaseTest;
import br.sp.pccarvalho.pages.LoginPage;
import br.sp.pccarvalho.pages.MenuPage;


public class Renovar_NoIp extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	LoginPage menuLogin = new LoginPage();
	
	
	@Test
	public void abrirTelaLogin() {
		
		menuLogin.escreverTexto(By.xpath("//*[@id=\"clogs\"]/input[2]"), "leba.lebacon@gmail.com");
		menuLogin.escreverTexto(By.xpath("//*[@id=\"clogs\"]/input[3]"), "12345678");
		menuLogin.clicarLogin();
	////*[@id="clogs"]/input[2]email
	////*[@id="clogs"]/input[3]senha
	////*[@id="clogs"]/button enviar
	
	}
	
}
