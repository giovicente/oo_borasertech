package br.com.letscode.oo;

public class Conta {
    String numero;
    double saldo; // BigDecimal
    String titular;
    double limite;

    Conta(String numero, double saldo, String titular, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.limite = limite;
    }

    Conta() { }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", limite=" + limite +
                '}';
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    boolean saca(double valor) {
        if (this.saldo < 0) {
            System.out.println("Você já está no cheque especial, fique atento...");
        }

        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
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
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }

        return false;
    }
}
