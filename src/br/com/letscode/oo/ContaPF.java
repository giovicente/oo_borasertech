package br.com.letscode.oo;

public class ContaPF extends Conta {
    private String cnpj;

    private String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public boolean saca(double valor) {
        this.saldo -= valor;
        this.saldo -= 0.90;
        System.out.println("Estou pegando o saque da CONTA FISICA");
        return true;
    }
}
