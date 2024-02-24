
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	
	public abstract double getTaxaBonificacao();
	
	Funcionario(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
		System.out.println("Salário: "  + getSalario());
		System.out.println(getTipo() + "\n");
	}
	
	public String getNome() {
		return nome;
	}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
	public String getCpf() {
		return cpf;
	}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
	public abstract double getSalario();
		public abstract void setSalario(double salario);
		
	public abstract String getTipo();
}

