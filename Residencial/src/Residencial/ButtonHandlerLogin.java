package Residencial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ButtonHandlerLogin implements ActionListener {
	TelaLogin login;
	TelaPrincipal telaprincipal;
	
	public ButtonHandlerLogin(TelaLogin login) {
		this.login = login;
	}
	
	public ButtonHandlerLogin(TelaPrincipal telaprincipal) {
		this.telaprincipal = telaprincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == login.entrarButton) {
			if(login.fieldLogin.getText().equalsIgnoreCase("jonas")&& login.fieldSenha.getText().equalsIgnoreCase("123")){
				System.out.println(login.fieldLogin.getText());
				System.out.println(login.fieldSenha.getText());
				JOptionPane.showMessageDialog(null, "Senha Correta");
				login.dispose();
				new TelaPrincipal();
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Senha Incorreta");
			}
		}
		else{
			System.exit(0);
		}		
	}
}
