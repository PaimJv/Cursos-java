package br.com.bytebank_operacoes.conta;

public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		return "Conta Poupança";
	}
	
	public ContaPoupanca(int agencia) {
		super(agencia);	
	}
	
	@Override
	public void saque(double valor) {
		double taxa = 0.2;
		super.saque(valor + taxa);
	}
	
//	@Override
//	public String toString() {
//		this.mostraDados();
//		return "";
//	}
}

