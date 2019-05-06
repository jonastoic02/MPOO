package View;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class viewCadastroMorador extends JFrame{
	JLabel labelImage,labelMorador,labelRg,labelCpf,labelTelefone;
	JTextField fieldMorador,fieldRg,fieldCpf,fieldTelefone;
	JButton buttonConfirmar, buttonCancelar;
	ImageIcon image;
	GridBagConstraints gbc;
	public int NOVA_LINHA = 0, NOVA_COLUNA = 1;
	
	public viewCadastroMorador(){
		//Para não fechar todo o programa, deixei default.
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		
		image = new ImageIcon(getClass().getResource("imageViewCadastroMorador.png"));
		
		labelImage = new JLabel(image);
		labelMorador = new JLabel("Nome: ");
		labelRg = new JLabel("RG: ");
		labelCpf = new JLabel("CPF: ");
		labelTelefone = new JLabel("Telefone: ");
		
		fieldMorador = new JTextField(10);
		fieldRg = new JTextField(10);
		fieldCpf = new JTextField(10);
		fieldTelefone = new JTextField(10);
		
		buttonConfirmar = new JButton("Confirmar");
		buttonCancelar = new JButton("Cancelar");
		
		gbc = new GridBagConstraints();
		
		gbc.insets = new Insets(10,10,0,10);		
		
		gbc.anchor = GridBagConstraints.CENTER;
		this.gridBagLayout(NOVA_LINHA,2);
		add(labelImage,gbc);
		
		
		this.gridBagLayout(NOVA_LINHA,1);
		add(labelMorador,gbc);
		this.gridBagLayout(NOVA_COLUNA,1);
		add(fieldMorador,gbc);
		
		this.gridBagLayout(NOVA_LINHA,1);
		add(labelRg,gbc);
		this.gridBagLayout(NOVA_COLUNA,1);
		add(fieldRg,gbc);
		
		this.gridBagLayout(NOVA_LINHA,1);
		add(labelCpf,gbc);
		this.gridBagLayout(NOVA_COLUNA,1);
		add(fieldCpf,gbc);
		
		this.gridBagLayout(NOVA_LINHA,1);
		add(labelTelefone,gbc);
		this.gridBagLayout(NOVA_COLUNA,1);
		add(fieldTelefone,gbc);
		
		gbc.anchor = GridBagConstraints.LINE_END;
		this.gridBagLayout(NOVA_LINHA,1);
		add(buttonConfirmar,gbc);
		this.gridBagLayout(NOVA_COLUNA,1);
		add(buttonCancelar,gbc);
		
	}	
	
	public JTextField getFieldMorador() {
		return fieldMorador;
	}

	public JTextField getFieldRg() {
		return fieldRg;
	}

	public JTextField getFieldCpf() {
		return fieldCpf;
	}

	public JTextField getFieldTelefone() {
		return fieldTelefone;
	}

	public JButton getButtonConfirmar() {
		return buttonConfirmar;
	}

	public JButton getButtonCancelar() {
		return buttonCancelar;
	}

	public void gridBagLayout(int numero,int espaco){
		if(NOVA_LINHA == numero){
			gbc.gridy ++;
			gbc.gridx = 0;
		}
		else{
			gbc.gridx ++;
		
		}
		gbc.gridwidth = espaco;
	}
}