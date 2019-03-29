package APP;

public class BaseDados {
	//static faz com que o atributo pertence a classe e não ao objeto, isso que significa que não
	//preciso instânciar para pegar um atributo statico.
	public static Usuario usuario = new Usuario("hotmail","12315211521","haha");
	private static Usuario usuario2 = new Usuario("hotmail","123-456-789-00","qwert12345");
	
	//Não cabe o this, o porquê disso é : NÃO EXISTEM OBJETOS, usuario e usuario 2 pertencem a classe e não aos seus individuos.
	//Com static = Acessar o atributo da classe!
	public static Usuario getUsuario2() {
		return usuario2;
	}
	
	

}
