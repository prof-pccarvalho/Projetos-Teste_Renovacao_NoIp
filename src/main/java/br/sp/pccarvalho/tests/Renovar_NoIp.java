package br.sp.pccarvalho.tests;

import org.junit.Test;
import br.sp.pccarvalho.core.BaseTest;
import br.sp.pccarvalho.pages.LoginPage;
import br.sp.pccarvalho.pages.MenuPage;


public class Renovar_NoIp extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	LoginPage menuLogin = new LoginPage();
	
	
	@Test
	public void abrirTelaLogin() { //rodar um teste simples para verificar se está ok
		
	menuPage.acessarTelaLogin();
	}
	
}
