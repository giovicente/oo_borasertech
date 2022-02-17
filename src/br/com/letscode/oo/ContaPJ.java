package br.com.letscode.oo;

public class ContaPJ extends Conta {
    private String cnpj;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean saca(double valor) {
        this.saldo -= valor;
        this.saldo -= 0.20;
        System.out.println("Estou pegando o saque da CONTA PJ");
        return true;
    }
}
