package login;

public class App {
	public static void main(String[] args) {
		//BaseDados.getUsuarios().add(usuario)
			//Só VÊ add de usuario porque tem o get
			//Mas não fará parte do sistema!
		//Objeto vs Objeto Anônimo
	
		BaseDados.adicionarUsuario(new Usuario("Eu","Eu"));
		BaseDados.adicionarUsuario(new Usuario("JA","JA"));
		BaseDados.adicionarUsuario(new Usuario("CS","CS"));
		
		//Destrutor.destrutor(usuario);
		
		//Só se pode fazer uso de objeto anônimo como parâmetro
		//BaseDados.adicionarUsuario(new Usuario("Eu","Eu"));
			
		for(Usuario u: BaseDados.recuperarUsuario()) {
			System.out.println(u.getLogin() + u.getSenha());
		}
		
		BaseDados.removerUsuario(new Usuario("Eu","Eu"));
		
		for(Usuario u: BaseDados.recuperarUsuario()) {
			System.out.println(u.getLogin() + u.getSenha());
		}
		
		
		
		//Quest N = Ilustrar o uso dos metódos CRUD da Base
		
		/*Precisa existir usuario? Não, porque os dados a serem usados estão na BaseDados
		*Então o que fazer depois de adicionar usuario da base?
		*Resposta: Liberar Memória, Como? Metódido Destrutor!
		*usuario = null
		System.gc(); */	
		
		//Quest N + 1 = Qual o collection em java para fila e pilha?
		//Quest N + 2 = Como manter a estrutura ordenada? Implementar um exemplo do add usuario
		//Quest N + 3 = Qual a diferença de List / ArrayList / LinkedList / Vector,...
	}
}