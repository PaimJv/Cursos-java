package br.com.bytebank_operacoes.conta;

import br.com.bytebank_operacoes.conexao.ErroException;
import br.com.bytebank_operacoes.conta.cliente.Cliente;

public abstract class Conta extends Object implements Comparable<Conta> {
	private double saldo;
	private int agencia;
	private int numero;
	private static int contagem=1;
	private Cliente titular;
	private String complemento;
	private boolean valida;
	private String tipo;
	
	public static int getTotal(){
		return contagem;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public Conta(int agencia) {
		if(agencia<0) {
			System.out.println("Opção inválida \n");
			valida = false;
		} else {
			setAgencia(agencia);	
			valida = true;
		}
		setNumero(contagem++);
	}
	
	public void novoCliente(String nome, String cpf) {
		this.titular = new Cliente();
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public void mostraDados() {
		if(valida == false) {
			return;
		} else {
			System.out.println("--- " + this.getNome() + " ---");
			System.out.println(this.getTipo());
			System.out.println("CPF: " + this.getCpf());
			if(this.getNumero() == 0) {
				contagem++;
				this.setNumero(contagem);
			}
			if(getNumero() < 10) {
				complemento = "00000";
			}
			else if(getNumero() > 9 && getNumero() < 100) {
				complemento = "0000";
			}
			else if(getNumero() > 99 && getNumero() < 1000) {
				complemento = "000";
			}
			else if(getNumero() > 999 && getNumero() < 10000) {
				complemento = "00";
			}
			System.out.println("Conta: " + complemento + getNumero() + "-" + getAgencia());
			System.out.println("Saldo da conta: R$: " + getSaldo());
		}
	}
	
	public void setNome (String nome) {
		nome = nome.toLowerCase(); //todas as letras minúsculas
		nome = nome.toUpperCase().charAt(0) + nome.substring(1); //primeira letra maiuscula;
		this.titular.setNome(nome);
	}
		public String getNome() {
			return this.titular.getNome();
		}
	
	public void setCpf(String cpf){
		this.titular.setCpf(cpf);
	}
		public String getCpf(){
			return this.titular.getCpf();
		}
	
	public void setNumero(int novoNumero) {
		if(novoNumero <= 0) {
			System.out.println("Insira um valor positivo.");
			return;
		}
		this.numero = novoNumero;	
	}
		public int getNumero() {
			return this.numero;
		}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Insira um valor positivo.");
			return;
		}
		this.agencia = agencia;
	}
		public int getAgencia() {
			return this.agencia;
		}
	
	public void deposito(double valor) {
		System.out.println("\n--- " + this.getNome() + " ---");
		if(valor < saldo | valor <= 0) {
			throw new ErroException("Erro"); // unchecked (RuntimeException)
		} else {
			saldo += valor;		
			System.out.println("Saldo da conta: R$ " + saldo);
		}
	}
	
	public void saque(double valor) throws ErroException {
		System.out.println("\n--- " + this.getNome() + " ---");
		if(valor > saldo | valor <= 0) {
			throw new ErroException("Erro"); // unchecked (RuntimeException)
		} else {
			saldo -= valor;
			System.out.println("Saque realizado. \n"
					+ "Saldo atual da conta: R$ " + saldo + ". \n");
		}
	}

	public void transferencia(double valor, Conta recebe) {
		System.out.println("\n--- " + this.getNome() + " ---");
		if(valor > saldo | valor <= 0) {
			throw new ErroException("Erro"); // unchecked (RuntimeException)
		} else {
			this.saldo -= valor;
			recebe.saldo += valor;
			System.out.println("Transferência de R$ " + valor + " para " + recebe.getNome() + 
					" realizada com sucesso.");
			System.out.println("Saldo da conta: R$ " + this.saldo);
		}		
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia | this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta o) { //ordem natural de organização: com base na agencia
		return Integer.compare(this.getAgencia(), o.getAgencia());	
	}

	@Override
	public String toString() {
		this.mostraDados();
		return "";
	}
}