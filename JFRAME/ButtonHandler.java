package JFRAME;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener{
	LoginTratamentoEmOutraClasse login;
	
	public ButtonHandler(LoginTratamentoEmOutraClasse login) {
		this.login = login;
	}




	public void actionPerformed(ActionEvent event) {
		//event guarda o autor do evento
		if(event.getSource()==login.acessButton) {
			JOptionPane.showMessageDialog(null,"Senha Errada!");
		}
		
		//ou usa else, pois só tem 2 botões
		if(event.getSource()==login.exitButton) {
			System.exit(0);
		}
}
}