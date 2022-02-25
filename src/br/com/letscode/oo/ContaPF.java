package br.com.letscode.oo;

import br.com.letscode.enums.TipoContaEnum;

public class ContaPF extends Conta {
    private String cpf;
    private final double VALOR_TARIFA_SAQUE_PF = 0.90d;

    private String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean saca(double valor, double limite) {

        if ((this.saldo + limite) >= valor) {

            this.saldo -= valor;
            this.saldo -= this.VALOR_TARIFA_SAQUE_PF;
            System.out.println("Estou pegando o saque da CONTA FISICA");
            return true;
        }

        System.out.println("Limite insuficiente");
        return false;
    }

    public ContaPF(String numero, double saldo, String titular, double limite,
                   String cpf, String tipoContaEnum) {
        super(numero, saldo, titular, limite, tipoContaEnum);
        this.cpf = cpf;
    }

    public ContaPF() {
    }

    @Override
    public String toString() {
        return "Conta {" +
                "numero da conta='" + this.numero + '\'' +
                ", saldo da conta=" + this.saldo +
                ", titular='" + this.titular + '\'' +
                ", limite=" + this.limite + '\'' +
                ", tipo da conta=" + this.tipoContaEnum + '\'' +
                ", cpf=" + this.cpf +
                '}';
    }

    public void echo() {
        System.out.println("Echooo");
    }
}
