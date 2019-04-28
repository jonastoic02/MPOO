package Residencial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame{
	JButton entrarButton,sairButton;
	JLabel imageLogin,labelLogin,labelSenha;
	JTextField fieldLogin;
	JPasswordField fieldSenha;
	ImageIcon telaLoginIcon;
	
	
	public TelaLogin() {
		super("Residencial das Flores");
		
		telaLoginIcon = new ImageIcon(getClass().getResource("loginImage.png"));
		imageLogin = new JLabel(telaLoginIcon);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("loginImage.png")));
		
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
		
		sairButton.addActionListener(new ButtonHandlerLogin(this));
		entrarButton.addActionListener(new ButtonHandlerLogin(this));
		
		add(imageLogin);
		add(labelLogin);
		add(fieldLogin);
		add(labelSenha);
		add(fieldSenha);
		add(entrarButton);
		add(sairButton);
		
		this.setBackground(Color.BLACK);
	}
}
