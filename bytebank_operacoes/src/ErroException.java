
public class ErroException extends RuntimeException{
	public ErroException (String mensagem) {
		super(mensagem);
		System.out.println(mensagem);
	}
}

