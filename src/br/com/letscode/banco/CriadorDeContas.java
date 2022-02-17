package br.com.letscode.banco;

import br.com.letscode.oo.Conta;

public class CriadorDeContas {
    public static void main(String[] args) {
        Conta contaHugo = new Conta();
        contaHugo.setNumero("002");

        Conta contaGiovanni = new Conta("0001", 2000, "Giovanni", 2000);
    }
}
