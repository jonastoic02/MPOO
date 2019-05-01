package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Sindico;
import View.viewCadastroMorador;
import View.viewTelaLogin;
import View.viewTelaPrincipal;

public class controllerTelaLogin implements ActionListener {
	viewTelaLogin telalogin;
	Sindico sindico;
	viewTelaPrincipal telaprincipal;
	viewCadastroMorador telacadastromorador;

	public controllerTelaLogin(viewTelaLogin telalogin, viewTelaPrincipal telaprincipal,Sindico sindico,viewCadastroMorador telacadastromorador) {
		this.telalogin = telalogin;
		this.telaprincipal = telaprincipal;
		this.sindico = sindico;
		this.telacadastromorador = telacadastromorador;
		control();
	}
	
	public void control(){
		telalogin.getSairButton().addActionListener(this);
		telalogin.getEntrarButton().addActionListener(this);
		telaprincipal.getMenuMrdCadastrarMorador().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telalogin.getSairButton()){
			System.exit(0);
		}
		if(telalogin.getFieldLogin().getText().equalsIgnoreCase(sindico.login) 
					&&
					telalogin.getFieldSenha().getText().equalsIgnoreCase(sindico.senha)){
				
				telalogin.dispose();
				telaprincipal.setVisible(true);
				
		}
		
		if(e.getSource() == telaprincipal.getMenuMrdCadastrarMorador()){
			telacadastromorador.setVisible(true);
		}
		
	}
		
}
	

