
public class Vendedor extends Funcionario {

	private double salario = 2000.0;
	private String tipo = "Vendedor";
	private double taxaBonificacao = 0.1;
	
	Vendedor(String nome, String cpf){
		super(nome, cpf);
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

