package JFRAME;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//Tratamento de evento de botão: Classe ActionEvent
//Comportamento na Interface: ActionListener
public class LoginTratamentoNaPropiaClasse extends JFrame implements ActionListener{
	
	JButton exitButton;
	JButton acessButton;
	JLabel loginLabel;
	JLabel senhaLabel;
	JTextField textLogin;
	JTextField textSenha;
	
	public LoginTratamentoNaPropiaClasse() {
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
		
		//1º Tratar a ação na própria Classe, pois o actionPerformed está na Classe!
		exitButton.addActionListener(this);
		acessButton.addActionListener(this);
				
		add(loginLabel);
		add(textLogin);		
		add(senhaLabel);
		add(textSenha);	
		add(acessButton);
		add(exitButton);
						
	}

	public void actionPerformed(ActionEvent event) {
		//event guarda o autor do evento
		if(event.getSource()==acessButton) {
			if(textLogin.getText() == "Jonas" && textSenha.getText() == "jonas") {
				JOptionPane.showMessageDialog(null,"Senha Correta!");
				System.out.println(event.getSource());
			}
			System.out.println(event.getSource());
			JOptionPane.showMessageDialog(null,"Senha Errada!");
		}
		
		//ou usa else, pois só tem 2 botões
		if(event.getSource()==exitButton) {
			System.exit(0);
		}
		
	}
	
}

