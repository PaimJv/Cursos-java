package br.com.bytebank_operacoes.main;

import br.com.bytebank_operacoes.conta.Conta;
import br.com.bytebank_operacoes.conta.ContaCorrente;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

public class TesteArray {

	public static void main(String[] args) {
		int tam = 3, i = tam, j=tam;
		int idades[][] = new int[i][j];

		for(i=0; i<tam; i++) {
			for(j=0; j<tam; j++) {
				System.out.print("[" + (i+1) + "] ");
				if(j==(tam-1)) {
					System.out.println();
				}
			}
		}
		
//		Object referencias[] = new Object[tam];
//		ContaCorrente cc = new ContaCorrente(i);
//		referencias[0] = new ContaPoupanca(i);
//		ContaPoupanca cp = (ContaPoupanca) referencias[0];
//		
//		System.out.println(referencias[0]);
		
//		idades[2] = 2;
//		System.out.println(idades[2]);
//	}

	for(i=0; i<args.length; i++) {
		System.out.println(args[i]);
	}
	
	}
}
