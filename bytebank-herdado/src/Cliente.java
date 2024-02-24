
public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private int senha;
	private AutenticavelMetodos metodos;
	
	public Cliente(String nome, String cpf, int senha){
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.metodos = new AutenticavelMetodos();
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
