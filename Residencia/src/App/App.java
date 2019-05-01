package App;

import View.viewCadastroMorador;
import View.viewTelaLogin;
import View.viewTelaPrincipal;
import Controller.controllerTelaLogin;
import Model.Sindico;

public class App {
	public static void main(String[] args) {	
		
		new controllerTelaLogin(new viewTelaLogin(),new viewTelaPrincipal(),new Sindico(),new viewCadastroMorador());
		
		
	}
}
