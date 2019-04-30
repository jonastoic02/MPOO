package View;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame {
	JLabel entrouLabel;
	JButton sairButton;
	
	public Tela() {
		setSize(140,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);		
		setLayout(new FlowLayout());
		
		entrouLabel = new JLabel("Entrou");
		sairButton = new JButton("Sair");
		
		this.add(entrouLabel);
		this.add(sairButton);
		this.getContentPane().setBackground(Color.BLUE);
		
	}

	public JButton getSairButton() {
		return sairButton;
	}

}
