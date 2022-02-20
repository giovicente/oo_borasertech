package br.com.letscode.banco;

import br.com.letscode.oo.ContaPF;

public class CriadorDeContasPF {
    public static void main(String[] args) {
        ContaPF contaPF = new ContaPF();
        contaPF.setCpf("99877655442");
        contaPF.setNumero("4355");
        contaPF.setLimite(3000);

        contaPF.deposita(1000);

        ContaPF novaContaPF
                = new ContaPF("4355", 2000, "Giovanni", 5000, "99999999999");

        System.out.println(novaContaPF);

        novaContaPF.saca(1000, contaPF.getLimite());
        System.out.println("Saldo após o saque: " + novaContaPF.getSaldo());
    }
}
