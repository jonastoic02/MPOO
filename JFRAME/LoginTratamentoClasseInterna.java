package JFRAME;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// O Tratamento está numa classe interna(NÃO ANÔNIMA)

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
		
		//Instância classe onde está o tratamento do botão!
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

	/*Tratamento De Botão em Classe Interna
	 *Assunto Classe Interna:
	 * - pode realizar mudança no encapsulamento
	 * - CUIDADO: A classe principal é sempre pública: Q1 - O porquê disso?
	 * - Classe interna não admite main():
	 */

	//Conter - Agregação e composição
	//Vê no deitel como ele trata como solução paracomposição o uso de classe interna privada.
	
	
	
	//Classe que irá tratar os botões.
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

