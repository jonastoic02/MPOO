package App;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//ITERAÇÃO DE ATUALIZADA DE TELA, PODE SER VIA USUÁRIO E TELA
//USUARIO = TRATAMENTO EVENTO TECLADO/MOUSE
//SISTEMA = VARIAS OPÇÕES(PAINT/REPAINT/TIMER/THREAD/

public class Jogo extends JFrame implements KeyListener{
	
	JLabel personagemUsuarioLabel,personagemPolicialLabel; //personagem
	int posX,posY = 50;
	
	//Manipulação de arquivos em MPOO = txt,xml,ImageIcon,BufferImage | Locais = file;

	public Jogo() {
		super("Jogo");
		setResizable(false);
		setSize(1000,800);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setLayout(null);
		getContentPane().setBackground(Color.YELLOW);
		
		try {//Tratamento de Exceção
		personagemUsuarioLabel = new JLabel(new ImageIcon("Imagem/imagem.png"));
		//Em jogos sempre precisa estabelecer um local para as imagens do jogo
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error");
		}
		
		personagemUsuarioLabel.setBounds(posX, posY/2, 64, 54);
		
		//personagemLabel.setLocation(this.getWidth()/2, this.getHeight()/2);
		
		add(personagemUsuarioLabel);
		
		addKeyListener(this);
		setVisible(true);
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) { //VK = ValueKey
			int i = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Sair", JOptionPane.YES_NO_OPTION);
			//System.exit(0);
			System.out.println(i);
			
			if(i==0) {
				System.exit(0);
			}
			else {
				
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			posY = posY - 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			posY = posY + 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_A) {
			posX = posX - 10;
		}
		if(e.getKeyCode() == KeyEvent.VK_D) {
			posX = posX + 10;
		}
		
		personagemUsuarioLabel.setBounds(posX, posY, 64, 54);
	
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
