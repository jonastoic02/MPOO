package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class viewTelaPrincipal extends JFrame{
	JMenuBar barraMenu;
	JMenu menuApartamento, menuMoradores, menuDespesas,menuItens,menuSair;
	JMenuItem menuAptCadastroApartamento, menuAptRemoverApartamento,menuAptBuscarApartamento,menuAptAlterarApartamento,
	menuMrdCadastrarMorador,menuMrdRemoverMorador,menuMrdBuscarMorador,menuMrdAlterarMorador,menuSairExit,
	menuSairExitSalvar;	
	
	public viewTelaPrincipal() {
		super("Residencial das Flores");
		
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("loginImage.png")));
		//this.getContentPane().setBackground(Color.WHITE);
		
		barraMenu = new JMenuBar();
		menuApartamento= new JMenu("Apartamentos");
		menuMoradores = new JMenu("Moradores");
		menuDespesas = new JMenu("Despesas");
		menuItens = new JMenu("Itens");
		menuSair = new JMenu("Sair");
		
		menuAptCadastroApartamento = new JMenuItem("Cadastrar Apartamento");
		menuAptRemoverApartamento = new JMenuItem("Remover Apartamento");
		menuAptBuscarApartamento = new JMenuItem("Buscar Apartamento");
		menuAptAlterarApartamento = new JMenuItem("Alterar Apartamento");
		
		menuMrdCadastrarMorador = new JMenuItem("Cadastrar Morador");
		menuMrdRemoverMorador = new JMenuItem("Remover Morador");
		menuMrdBuscarMorador = new JMenuItem("Buscar Morador");
		menuMrdAlterarMorador = new JMenuItem("Alterar Morador");
		
		menuSairExit = new JMenuItem("Sair");
		menuSairExitSalvar = new JMenuItem("Sair e Salvar");
		
		setJMenuBar(barraMenu);
		
		barraMenu.add(menuApartamento);
		barraMenu.add(menuMoradores);
		barraMenu.add(menuSair);
		
		menuApartamento.add(menuAptCadastroApartamento);
		menuApartamento.add(menuAptRemoverApartamento);
		menuApartamento.add(menuAptBuscarApartamento);
		menuApartamento.add(menuAptAlterarApartamento);
		
		menuMoradores.add(menuMrdCadastrarMorador);
		menuMoradores.add(menuMrdRemoverMorador);
		menuMoradores.add(menuMrdBuscarMorador);
		menuMoradores.add(menuMrdAlterarMorador );
		
		menuSair.add(menuSairExit);
		menuSair.add(menuSairExitSalvar);	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
	}

	public JMenuItem getMenuMrdCadastrarMorador() {
		return menuMrdCadastrarMorador;
	}

	public JMenuItem getMenuMrdRemoverMorador() {
		return menuMrdRemoverMorador;
	}

	public JMenuItem getMenuMrdBuscarMorador() {
		return menuMrdBuscarMorador;
	}

	public JMenuItem getMenuMrdAlterarMorador() {
		return menuMrdAlterarMorador;
	}

	
}
