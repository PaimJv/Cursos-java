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
		}
	public String getCpf() {
		return cpf;
	}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
}
