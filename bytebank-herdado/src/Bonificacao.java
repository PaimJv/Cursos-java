
public class Bonificacao {
	
	public double getBonificacao(Funcionario f) {
		return (f.getSalario() * f.getTaxaBonificacao());
	}
	
	public void reajusteSalarial(Funcionario f) {
		f.setSalario(f.getSalario() + (f.getTaxaBonificacao() * f.getSalario()));
		System.out.println("Novo salário de " + f.getNome() + ": " + f.getSalario() + "\n");
	}
}

