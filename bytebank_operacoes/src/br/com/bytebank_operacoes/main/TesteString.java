package br.com.bytebank_operacoes.main;

import br.com.bytebank_operacoes.conta.ContaCorrente;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

public class TesteString {

	public static void main(String[] args) {
		String vazio = "   ";
		vazio = vazio.trim(); //tira os espaços
		System.out.println(vazio.isEmpty());
		
		String nome = "JOAO";
		System.out.println(nome.indexOf("j"));
		System.out.println(nome.toUpperCase().charAt(0));
		
		nome = nome.toLowerCase(); //todas as letras minúsculas
		nome = nome.toUpperCase().charAt(0) + nome.substring(1); //primeira letra maiuscula;
		
		int i;
		for(i=0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println("Olá, " + nome + "! Como vai?");
		
		ContaPoupanca cc = new ContaPoupanca(3);
		cc.novoCliente("joao", "00000000");
		cc.mostraDados();
//		System.out.println(cc);
	}

}
