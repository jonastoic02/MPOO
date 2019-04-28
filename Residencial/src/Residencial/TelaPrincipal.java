package Residencial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame{
	JMenuBar barraMenu;
	JMenu menuNovo, menuFerramentas, menuSobre,menuOpcoes,menuSair;
	JMenuItem menuNovoCadastroApartamento, menuNovoCadastroCliente,menuNovoCadastroDespesa,menuNovoCadastroSalvar,menuSairExit,
	menuSairExitSalvar;	
	
	public TelaPrincipal() {
		super("Residencial das Flores");
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("loginImage.png")));
		this.getContentPane().setBackground(Color.WHITE);
		
		barraMenu = new JMenuBar();
		menuNovo = new JMenu("Novo");
		menuFerramentas = new JMenu("Ferramentas");
		menuSobre = new JMenu("Sobre");
		menuOpcoes = new JMenu("Opções");
		menuSair = new JMenu("Sair");
		
		menuNovoCadastroApartamento = new JMenuItem("Cadastrar Apartamento");
		menuNovoCadastroCliente = new JMenuItem("Cadastrar Cliente");
		menuNovoCadastroDespesa = new JMenuItem("Cadastrar Despesa");
		menuNovoCadastroSalvar = new JMenuItem("Salvar");
		menuSairExit = new JMenuItem("Sair");
		menuSairExitSalvar = new JMenuItem("Sair e Salvar");
		
		
		menuNovoCadastroApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelasCadastros(menuNovoCadastroApartamento);
			}
		});
		
		menuSairExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
			
		setJMenuBar(barraMenu);
		barraMenu.add(menuNovo);
		barraMenu.add(menuFerramentas);
		barraMenu.add(menuSobre);
		barraMenu.add(menuOpcoes);
		barraMenu.add(menuSair);
		
		menuNovo.add(menuNovoCadastroApartamento);
		menuNovo.add(menuNovoCadastroCliente);
		menuNovo.add(menuNovoCadastroDespesa);
		menuNovo.add(menuNovoCadastroSalvar);
		menuSair.add(menuSairExit);
		menuSair.add(menuSairExitSalvar);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
	}

	
}
