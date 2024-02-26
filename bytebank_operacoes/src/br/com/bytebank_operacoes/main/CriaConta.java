package br.com.bytebank_operacoes.main;

import br.com.bytebank_operacoes.conta.Conta;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

/**
 * @author Joao
 * @since 1.8
 */

public class CriaConta {
	public static void main(String[] args) {
		
//		Conta primeiraConta = new ContaCorrente(2);
//		primeiraConta.novoCliente("Raimundo Leite", "000.000.000-00");
//		primeiraConta.mostraDados();
//
//		primeiraConta.deposito(200.57);
		
		Conta segundaConta = new ContaPoupanca(1);
		segundaConta.novoCliente("Bianca Gordiano", "000.000.000-00");
		segundaConta.mostraDados();

		segundaConta.deposito(20);
		segundaConta.saque(10);
		
//		primeiraConta.transferencia(50, segundaConta);
		
//		Conta contaJoao = new Conta(3);		
//		
//		contaJoao.novoCliente("João Victor Paim", "000.000.000-00");
//		contaJoao.mostraDados();
//
//		contaJoao.deposito(100);
//		contaJoao.transferencia(55, segundaConta);
//		
//		System.out.println(Conta.getTotal());
	}
}
