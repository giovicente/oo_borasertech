package br.com.letscode.banco;

import br.com.letscode.oo.ContaPF;
import br.com.letscode.oo.ContaPJ;

public class CriadorDeContasPJ {
    public static void main(String[] args) {
        ContaPJ contaPJ = new ContaPJ();
        contaPJ.setNumero("00012");
        contaPJ.setLimite(25000);
        contaPJ.setCnpj("0000000000000");
        contaPJ.saca(2000);

        System.out.println("Estou sacando 2000 mil da conta, meu saldo: " + contaPJ.getSaldo());

        ContaPF contaPF = new ContaPF();
        contaPF.deposita(2000);
        System.out.println("CNPJ: " + contaPJ.getCnpj());
        System.out.println("Saldo da minha conta PF: " + contaPF.getSaldo());
    }
}
