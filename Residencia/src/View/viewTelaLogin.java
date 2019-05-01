package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class viewTelaLogin extends JFrame{
	JButton entrarButton,sairButton;
	JLabel imageLogin,labelLogin,labelSenha;
	JTextField fieldLogin;
	JPasswordField fieldSenha;
	ImageIcon telaLoginIcon;
	
	
	public viewTelaLogin() {
		super("Residencial das Flores");
		
		//telaLoginIcon = new ImageIcon(getClass().getResource("loginImage.png"));
		//imageLogin = new JLabel(telaLoginIcon);
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("loginImage.png")));
		
		entrarButton = new JButton("Entrar");
		sairButton = new JButton("Sair");		
		labelLogin = new JLabel("Usuário");
		labelSenha = new JLabel("Senha");
		fieldLogin = new JTextField(10);
		fieldSenha = new JPasswordField(10);
		
		this.getContentPane().setBackground(Color.WHITE);
		
		setVisible(true);
		setSize(515,230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		setLayout(new FlowLayout());
		setResizable(false);
	
		//add(imageLogin);
		add(labelLogin);
		add(fieldLogin);
		add(labelSenha);
		add(fieldSenha);
		add(entrarButton);
		add(sairButton);
		
		this.setBackground(Color.BLACK);
	}


	public JButton getEntrarButton() {
		return entrarButton;
	}


	public JButton getSairButton() {
		return sairButton;
	}


	public JTextField getFieldLogin() {
		return fieldLogin;
	}


	public JPasswordField getFieldSenha() {
		return fieldSenha;
	}
}