
public class ContaCorrente extends Conta {
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	public ContaCorrente(int agencia) {
		super(agencia);
	}

}

