package View;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
	
	JButton exitButton;
	JButton acessButton;
	JLabel loginLabel;
	JLabel senhaLabel;
	JTextField textLogin;
	JTextField textSenha;
	
	public TelaLogin() {
		super("B");	
		exitButton = new JButton("Exit");
		acessButton = new JButton("Entrar");
		loginLabel = new JLabel("Login : ");
		senhaLabel = new JLabel("Senha : ");
		textLogin = new JTextField(10);
		textSenha = new JTextField(10);
			
		setSize(140,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);		
		setLayout(new FlowLayout());
				
		add(loginLabel);
		add(textLogin);		
		add(senhaLabel);
		add(textSenha);	
		add(acessButton);
		add(exitButton);
		
		setVisible(true);	
						
	}

	public JButton getExitButton() {
		return exitButton;
	}

	public JButton getAcessButton() {
		return acessButton;
	}

	public JTextField getTextLogin() {
		return textLogin;
	}

	public JTextField getTextSenha() {
		return textSenha;
	}
	
	/*public void addController() {
	*	exitButton.addActionListener(Metodo no Controller);
	}*/
}

