package APP;
import View.Tela;
import View.TelaLogin;
import View.TelaTeste;
import Controller.ControladorTelaLogin;
import Model.BaseDados;
import Model.Usuario;
import Model.FichaAtendimento;

public class App {
	
	//Exercicio - Como fazer um sistema de atendimento m�dico 
	
	// TelaMedico - Escolher a ficha ou nome; (JRadioButton)
	// TelaRecep��o - Exibe fichar atendimento ou o nome do paciente
	// Tela Atendente - (Escolhe apenas Ficha)
	// TelaMedico e TelaAtendente gerencia a TelaRecep��o
	
	
	public static void main(String[] args) {
		TelaTeste telateste = new TelaTeste();
		FichaAtendimento fichaatendimento = new FichaAtendimento();
		fichaatendimento.addObserver(telateste);
		
		//No questionamento quem faz essa papel? M�dico e a atendente.
		//MVC - controller das duas telas
		for(int i = 0; i < 10; i++) {
			fichaatendimento.modificarNumero(i);
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		//Cria��o das inst�ncias de MVC
		//BaseDados.usuarios.add(new Usuario("jonas","123"));
		//TelaLogin telalogin = new TelaLogin();
		//Tela tela = new Tela();
		//ControladorTelaLogin controladortelalogin= new ControladorTelaLogin(telalogin,tela);
		
		
		//
		
	}
}
