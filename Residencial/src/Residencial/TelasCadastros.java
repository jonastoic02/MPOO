package Residencial;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class TelasCadastros extends JFrame{
	TelaPrincipal telaprincipal;
	JLabel labelImagem,labelCadastroCliente,nomeCliente,cpfCliente,rgCliente,aptNumber,telCliente,mensalidadeCliente;
	JTextField nomeField,cpfField,rgField,aptField,telField,mensaliField; 
	JButton buttonConfirmar, buttonCancelar;
	GridBagConstraints gbc = null;
	private int NOVA_LINHA = 0, NOVA_COLUNA = 1;
	ImageIcon imageCadastroCliente; 
	
	public TelasCadastros(TelaPrincipal telaprincipal) throws HeadlessException {
		this.telaprincipal = telaprincipal;
	}
		
	public TelasCadastros(JMenuItem jmenuitem) {
		this.setVisible(true);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridBagLayout());
		this.getContentPane().setBackground(Color.WHITE);
		this.setResizable(false);
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,0,10);
		
		imageCadastroCliente = new ImageIcon(getClass().getResource("cadastroClienteImage.png"));
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("loginImage.png")));
		
		labelImagem = new JLabel(imageCadastroCliente);		
		labelCadastroCliente = new JLabel("Cadastrar Inquilino");
		nomeCliente = new JLabel("Nome: ");
		cpfCliente = new JLabel("CPF: ");
		rgCliente = new JLabel("RG: ");
		aptNumber = new JLabel("Apartamento: ");
		telCliente = new JLabel("Telefone: ");
		mensalidadeCliente = new JLabel("Mensalidade: ");
		
		nomeField = new JTextField(20);
		cpfField = new JTextField(10);
		rgField = new JTextField(10);
		aptField = new JTextField(5);
		telField = new JTextField(10);
		mensaliField = new JTextField(10);
		
		buttonConfirmar = new JButton("Confirmar");
		buttonCancelar = new JButton("Cancelar");
		
		gbc.anchor = GridBagConstraints.LINE_END;
		this.gbcConguration(NOVA_LINHA, 2);
		this.add(labelImagem);
		
		this.gbcConguration(NOVA_LINHA, 2);
		labelCadastroCliente.setFont(new Font("Serif",Font.BOLD + Font.ITALIC, 20));
		this.add(labelCadastroCliente);
		
		gbc.anchor = GridBagConstraints.WEST;
		this.gbcConguration(NOVA_LINHA,1);		
		this.add(nomeCliente,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(nomeField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		this.add(cpfCliente,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(cpfField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		this.add(rgCliente,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(rgField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		this.add(aptNumber,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(aptField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		this.add(telCliente,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(telField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		this.add(mensalidadeCliente,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(mensaliField,gbc);
		this.gbcConguration(NOVA_LINHA,1);
		
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(buttonConfirmar,gbc);
		this.gbcConguration(NOVA_COLUNA,1);
		this.add(buttonCancelar,gbc);

	}
	
	public void gbcConguration(int posicao, int qtdlinhas) {
		if(posicao == NOVA_LINHA) {
			gbc.gridy = gbc.gridy + 1;
			gbc.gridx = 0;
		}
		else {
			gbc.gridx = gbc.gridx + 1;
		}
		
		gbc.gridwidth = qtdlinhas;
		
		
	}
}
