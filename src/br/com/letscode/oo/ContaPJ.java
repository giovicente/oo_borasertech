package br.com.letscode.oo;

public class ContaPJ extends Conta {
    private String cnpj;
    private final double VALOR_TARIFA_SAQUE_PJ = 0.2d;

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean saca(double valor) {
        this.saldo -= valor;
        this.saldo -= VALOR_TARIFA_SAQUE_PJ;
        System.out.println("Estou pegando o saque da CONTA PJ");
        return true;
    }
}
