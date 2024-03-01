package br.com.bytebank_operacoes.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank_operacoes.conta.Conta;
import br.com.bytebank_operacoes.conta.ContaCorrente;
import br.com.bytebank_operacoes.conta.ContaPoupanca;

public class TesteOrdemLista3Lambda { //utilizando lambdas

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
                
//                lista.sort((Conta o1, Conta o2) -> Integer.compare(o1.getNumero(), o2.getNumero()));
//                lista.sort((Conta o1, Conta o2) -> o1.getNome().compareTo(o2.getNome()));
                lista.sort((Conta o1, Conta o2) -> Double.compare(o2.getSaldo(), o1.getSaldo()));
//                lista.sort(null); //ordem natural
                
                lista.forEach((Conta c1) -> System.out.println(c1));
        }
}