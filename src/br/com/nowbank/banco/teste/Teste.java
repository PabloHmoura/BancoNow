package br.com.nowbank.banco.teste;

import br.com.nowbank.banco.modelo.Conta;
import br.com.nowbank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);

        Conta cc = new ContaCorrente(11, 22);

        cc.deposita(120);

        cc.saca(120);

        System.out.println(cc);


    }
}
