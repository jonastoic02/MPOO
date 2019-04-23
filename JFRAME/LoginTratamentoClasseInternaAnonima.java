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

public class LoginTratamentoClasseInternaAnonima extends JFrame{
	
	JButton exitButton;
	JButton acessButton;
	JLabel loginLabel;
	JLabel senhaLabel;
	JTextField textLogin;
	JTextField textSenha;
	
	public LoginTratamentoClasseInternaAnonima() {
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
		
		acessButton.addActionListener(new ActionListener() { ) 
				
		add(loginLabel);
		add(textLogin);		
		add(senhaLabel);
		add(textSenha);	
		add(acessButton);
		add(exitButton);
						
	}
	
}

