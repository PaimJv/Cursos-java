package br.com.bytebank_operacoes.main;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank_operacoes.conta.Conta;
import br.com.bytebank_operacoes.conta.ContaCorrente;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		List<Object> lista = new ArrayList<Object>();
		//Collection engloba List engloba ArrayList, LinkedList e Vector
		
		Conta cc1 = new ContaPoupanca(4);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(2);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(4);
		
		Integer idade = new Integer(20);
		lista.add(idade);
		lista.add(23); //funciona através do AutoBoxing
		
		
//		System.out.println("Total: " + lista.size() + " itens.");
		
//		Object ref = lista.get(0);
//		Conta ref = (Conta) lista.get(0);
//		System.out.println(ref.getTipo());
		
//		for(int i=0; i<lista.size(); i++) {
//			Object ref = lista.get(i);
//			System.out.println(ref);
//		}	OU	| 
//				V
		
		for(Object ref : lista) { //método mais prático
			System.out.println(ref);
		}
		cc3 = cc1;
		System.out.println(lista.contains(cc3));
		
		String s = args[0]; // s = "10"
		Integer numero = Integer.valueOf(s); //autoboxing
//		int numero = Integer.parseInt(s); //unboxing
		System.out.println(numero+20); // numero já é um inteiro
		System.out.println(numero.doubleValue());
		
//		cc.novoCliente("joao", "cpf");
//		cc.mostraDados();

		List<Number> listaNumero = new ArrayList<Number>();
		listaNumero.add(24.7);
		listaNumero.add(numero);
		listaNumero.add(idade);
		
		for(Object ref : listaNumero) { //método mais prático
			System.out.println(ref);
		}
	}
}
