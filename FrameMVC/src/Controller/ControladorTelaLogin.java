package Controller;

import View.Mensagem;
import View.Tela;
import View.TelaLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.BaseDados;
import Model.Usuario;

public class ControladorTelaLogin implements ActionListener {
	TelaLogin telalogin;
	Tela tela;
	
	public ControladorTelaLogin(TelaLogin telalogin, Tela tela) {
		this.telalogin = telalogin;
		this.tela = tela;
		control();
	}
	
	public void control() {
		telalogin.getAcessButton().addActionListener(this);
		telalogin.getExitButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent u) {
				System.exit(0); //Matar o processo
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == telalogin.getAcessButton()) {
			if(BaseDados.isUsuario(new Usuario(telalogin.getTextLogin().getText(),telalogin.getTextSenha().getText()))){
				//Mensagem.ExibirMensagem("Entrou");
				telalogin.setVisible(false);
				tela.setVisible(true);
			}
			else {
				System.out.println("Não Entrou");
			}
			
		}
		
		
		if(e.getSource() == tela.getSairButton()) {
			telalogin.setVisible(true);
			tela.setVisible(false);
			System.out.println("Clicou em Sair Tela");
		}
			
	}
		
}

