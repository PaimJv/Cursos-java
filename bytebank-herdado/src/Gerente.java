
public class Gerente extends Funcionario implements Autenticavel{
	
	private double salario = 5000.0;
	private String tipo = "Gerente";
	private double taxaBonificacao = 0.2;
	private int senha;
	
//	public void setSenha(int senha) {
//		this.senha = senha;
//	}
	
//	public boolean autentica(int senha) {
//		if(this.senha == senha) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	Gerente(String nome, String cpf, int senha){
		super(nome, cpf);
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getTaxaBonificacao() {
		return this.taxaBonificacao;
	}	
	@Override
	public void setSalario(double salario) {
		this.salario = salario;
	}
		@Override
		public double getSalario() {
			return this.salario;
		}
	@Override
	public String getTipo() {
		return this.tipo;
	}
}

