package JFRAME;



//import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;


//Login Não fazer
public class LoginNaoFazer{
	
	public LoginNaoFazer() {
		//borda,tamanho,mecanismo,encerramento,receber componente,layout, local onde vai inicializar	
		JFrame jf = new JFrame();	
		JButton exitButton = new JButton("Exit");
		JButton acessButton = new JButton("Entrar");
		
		//Abre a janela no Tamanho da Tela do Monitor
		//Toolkit tk = Toolkit.getDefaultToolkit();
		//Dimension d = tk.getScreenSize();
		//d.width = largura, d.height = altura
		
		
		//Titulo da Janela
		jf.setTitle("XABLAU");
		//Tornar a Janela Vísivel
		jf.setVisible(true);
		//Tamanho da Janela
		jf.setSize(100,100);
		//Finalizar o Processo na memória ao Clicar em Fechar
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Iniciar Janela no centro da tela = null
		jf.setLocationRelativeTo(null);
		
		//Tirar Borda = true
		//jf.setUndecorated(boolean);
		
		jf.setLayout(new FlowLayout());
		
		jf.add(acessButton);
		jf.add(exitButton);
				
	}
	
	public static void main(String[] args) {
		new LoginNaoFazer();
	}
}
