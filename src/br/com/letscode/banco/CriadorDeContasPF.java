package br.com.letscode.banco;

import br.com.letscode.enums.TipoContaEnum;
import br.com.letscode.oo.Conta;
import br.com.letscode.oo.ContaPF;

public class CriadorDeContasPF {
    public static void main(String[] args) {
        ContaPF novaContaPF = new ContaPF("123", 2000, "Giovanni",
                3000, "99999999999", TipoContaEnum.CONTA_POUPANCA.getDescricao());
        System.out.println("Nova conta PF:" + novaContaPF);

        novaContaPF.saca(1000, novaContaPF.getLimite());
        novaContaPF.saca(1);

        novaContaPF.echo();
        Conta conta = new Conta();

    }

}
