package br.com.bytebank_operacoes.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank_operacoes.conta.Conta;
import br.com.bytebank_operacoes.conta.ContaCorrente;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

public class TesteOrdemLista2 { //utilizando classes anonimas

        public static void main(String[] args) {

                Conta cc1 = new ContaCorrente(3);
                cc1.novoCliente("larissa", "012");
                cc1.deposito(333.0);

                Conta cc2 = new ContaPoupanca(4);
                cc2.novoCliente("gilda", "123");
                cc2.deposito(444.0);

                Conta cc3 = new ContaCorrente(3);
                cc3.novoCliente("bianca", "234");
                cc3.deposito(111.0);

                Conta cc4 = new ContaPoupanca(2);
                cc4.novoCliente("raimundo", "345");
                cc4.deposito(222.0);

                List<Conta> lista = new ArrayList<>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);

                System.out.println("\n----------------\n");
                
//                lista.sort(new Comparator<Conta>(){
//                	@Override
//                	public int compare(Conta o1, Conta o2) {
//                		return Integer.compare(o1.getAgencia(), o2.getAgencia());
//                	}
//                });
//                lista.sort(new Comparator<Conta>(){
//                	@Override
//                	public int compare(Conta o1, Conta o2) {
//                		return o1.getNome().compareTo(o2.getNome());
//                	}
//                });
//                lista.sort(new Comparator<Conta>(){
//                	@Override
//                	public int compare(Conta o1, Conta o2) {
//                		return Double.compare(o2.getSaldo(), o1.getSaldo()); //ordem decrescente
//                	}
//                });
                lista.sort(null); //ordem natural
                
                for (Conta conta : lista) {
					System.out.println(conta);
				}
        }
}