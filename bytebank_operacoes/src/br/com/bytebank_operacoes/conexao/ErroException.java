package br.com.bytebank_operacoes.conexao;

public class ErroException extends RuntimeException{
	public ErroException (String mensagem) {
		super(mensagem);
		System.out.println(mensagem);
	}
}

