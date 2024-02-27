package br.com.bytebank_operacoes.conta.cliente;

public class Cliente {
	private String nome;
	String cpf;
	String profissao;
	Endereco endereco;
	Contato contato;
	
	public String getNome() {
		return nome;
	}
		public void setNome(String nome) {
			this.nome = nome;
			nome = nome.toLowerCase(); //todas as letras minúsculas
			nome = nome.toUpperCase().charAt(0) + nome.substring(1); //primeira letra maiuscula;
			
			if(nome.isEmpty()) {
				throw new IllegalStateException();
			}
		}
	public String getCpf() {
		return cpf;
	}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
}
