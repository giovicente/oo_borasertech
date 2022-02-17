package br.com.letscode.oo;

public class Main {
    public static void main(String[] args) {
//        Pessoa pessoaHugo;
//        pessoaHugo = new Pessoa();
//        pessoaHugo.nome = "Hugo";
//        pessoaHugo.idade = 25;
//        pessoaHugo.corCabelo = "nao sei";
//        pessoaHugo.corPele = "branca";
//
//        System.out.println("Nome da pessoa: " + pessoaHugo.nome);

        Conta contaHugo = new Conta("001", 200, "Hugo", 500);
//        contaHugo.titular = "Hugo Brendow";
//        contaHugo.limite = 500;
//        contaHugo.saldo = 200;
//        contaHugo.numero = "00002";

        System.out.println("Retornando conta: " + contaHugo.toString());
        System.out.println("Retornando conta 2: " + contaHugo);

//        System.out.println("Saldo antes do saque: " + contaHugo.saldo);
//        System.out.println("Saque efetuado com sucesso? " + contaHugo.saca(600));
//        System.out.println("Saldo após o saque: " + contaHugo.saldo);

        Conta contaGiovanni = new Conta();
        contaGiovanni.setTitular("Giovanni");
        contaGiovanni.setLimite(10000);
        contaGiovanni.setNumero("00004");

        System.out.println("Saldo do Hugo antes da transferencia: " + contaHugo.getSaldo());
        System.out.println("Saldo do Giovanni antes da transferencia: " + contaGiovanni.getSaldo());
        contaGiovanni.transfere(contaHugo, 12000);
        System.out.println("Saldo do Hugo depois da transferencia: " + contaHugo.getSaldo());
        System.out.println("Saldo do Giovanni depois da transferencia: " + contaGiovanni.getSaldo());
    }
}
