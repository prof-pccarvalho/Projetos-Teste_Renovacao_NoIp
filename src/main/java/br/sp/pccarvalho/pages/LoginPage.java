package br.sp.pccarvalho.pages;

import br.sp.pccarvalho.core.BasePage;
import br.sp.pccarvalho.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://www.noip.com/pt-BR");
	}
	
	public void setEmail(String email) {
		escrever("username", email);
	}
	
	public void setSenha(String senha) {
		escrever("password", senha);
	}
	
	public void entrar() {
		clicarBotaoporTexto("Entrar");
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}
