package br.com.letscode.oo;

import br.com.letscode.enums.TipoContaEnum;

public class Conta extends Object {
    protected String numero;
    protected double saldo; // BigDecimal
    protected String titular;
    protected double limite;
    protected String tipoContaEnum;

    public Conta(String numero, double saldo, String titular, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.limite = limite;
    }

    public Conta(String numero, double saldo, String titular, double limite, String tipoContaEnum) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.limite = limite;
        this.tipoContaEnum = tipoContaEnum;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTipoContaEnum() {
        return tipoContaEnum;
    }

    public void setTipoContaEnum(String tipoContaEnum) {
        this.tipoContaEnum = tipoContaEnum;
    }

    public Conta() { }

    @Override
    public String toString() {
        return "Conta {" +
                "numero da conta='" + this.numero + '\'' +
                ", saldo da conta=" + this.saldo +
                ", titular='" + this.titular + '\'' +
                ", limite=" + this.limite +
                '}';
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        System.out.println("Estou pegando o saque da conta");
        if (this.saldo < 0) {
            System.out.println("Você já está no cheque especial, fique atento...");
        }

        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            this.saldo -= 0.2;
            System.out.println("Saque efetuado com sucesso!");

            if (this.saldo < 0) {
                System.out.println("Bem vindo ao cheque especial!");
            }

            return true;
        }
        return false;
    }

    boolean transfere(Conta destino, double valor) {
        if (this.saca(valor)) {
            this.saldo -= 0.50;
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }

        return false;
    }
}
