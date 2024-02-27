package br.com.bytebank_operacoes.conta;

public class ContaCorrente extends Conta {
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	public ContaCorrente(int agencia) {
		super(agencia);
	}
	
	@Override
	public String toString() {
		return "Conta Corrente";
	}
}

