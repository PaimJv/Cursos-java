
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

}

