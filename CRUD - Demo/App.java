package login;

public class App {
	public static void main(String[] args) {
		//BaseDados.getUsuarios().add(usuario)
			//S� V� add de usuario porque tem o get
			//Mas n�o far� parte do sistema!
		//Objeto vs Objeto An�nimo
	
		BaseDados.adicionarUsuario(new Usuario("Eu","Eu"));
		BaseDados.adicionarUsuario(new Usuario("JA","JA"));
		BaseDados.adicionarUsuario(new Usuario("CS","CS"));
		
		//Destrutor.destrutor(usuario);
		
		//S� se pode fazer uso de objeto an�nimo como par�metro
		//BaseDados.adicionarUsuario(new Usuario("Eu","Eu"));
			
		for(Usuario u: BaseDados.recuperarUsuario()) {
			System.out.println(u.getLogin() + u.getSenha());
		}
		
		BaseDados.removerUsuario(new Usuario("Eu","Eu"));
		
		for(Usuario u: BaseDados.recuperarUsuario()) {
			System.out.println(u.getLogin() + u.getSenha());
		}
		
		
		
		//Quest N = Ilustrar o uso dos met�dos CRUD da Base
		
		/*Precisa existir usuario? N�o, porque os dados a serem usados est�o na BaseDados
		*Ent�o o que fazer depois de adicionar usuario da base?
		*Resposta: Liberar Mem�ria, Como? Met�dido Destrutor!
		*usuario = null
		System.gc(); */	
		
		//Quest N + 1 = Qual o collection em java para fila e pilha?
		//Quest N + 2 = Como manter a estrutura ordenada? Implementar um exemplo do add usuario
		//Quest N + 3 = Qual a diferen�a de List / ArrayList / LinkedList / Vector,...
	}
}