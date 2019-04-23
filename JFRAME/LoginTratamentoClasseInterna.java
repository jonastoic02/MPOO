package JFRAME;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// O Tratamento est� numa classe interna(N�O AN�NIMA)

public class LoginTratamentoClasseInterna extends JFrame{
	
	JButton exitButton;
	JButton acessButton;
	JLabel loginLabel;
	JLabel senhaLabel;
	JTextField textLogin;
	JTextField textSenha;
	ButtonHandler buttonhandler;
	
	public LoginTratamentoClasseInterna() {
		super("B");	
		exitButton = new JButton("Exit");
		acessButton = new JButton("Entrar");
		loginLabel = new JLabel("Login : ");
		senhaLabel = new JLabel("Senha : ");
		textLogin = new JTextField(10);
		textSenha = new JTextField(10);
		
		
		setVisible(true);		
		setSize(180,130);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);		
		setLayout(new FlowLayout());
		setResizable(false);
		
		//Inst�ncia classe onde est� o tratamento do bot�o!
		buttonhandler = new ButtonHandler();
		
		exitButton.addActionListener(new ButtonHandler());
		acessButton.addActionListener(buttonhandler);
				
		add(loginLabel);
		add(textLogin);		
		add(senhaLabel);
		add(textSenha);	
		add(acessButton);
		add(exitButton);
						
	}

	/*Tratamento De Bot�o em Classe Interna
	 *Assunto Classe Interna:
	 * - pode realizar mudan�a no encapsulamento
	 * - CUIDADO: A classe principal � sempre p�blica: Q1 - O porqu� disso?
	 * - Classe interna n�o admite main():
	 */

	//Conter - Agrega��o e composi��o
	//V� no deitel como ele trata como solu��o paracomposi��o o uso de classe interna privada.
	
	
	
	//Classe que ir� tratar os bot�es.
	public class ButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) { 
			if(event.getSource()==acessButton) {
/*				if(textLogin.getText() == "Jonas" && textSenha.getText() == "jonas") {
*					JOptionPane.showMessageDialog(null,"Senha Correta!");
*					System.out.println(event.getSource());
*				}
*				System.out.println(event.getSource());
*				JOptionPane.showMessageDialog(null,"Senha Errada!");
*/			}			
			if(event.getSource()==exitButton) {
				System.exit(0);
			}
			
		}
		
	}
	
}

