package br.com.letscode.oo;

public class ContaPF extends Conta {
    private String cpf;

    private String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean saca(double valor, double limite) {

        if ((this.saldo + limite) >= valor) {

            this.saldo -= valor;
            this.saldo -= 0.90;
            System.out.println("Estou pegando o saque da CONTA FISICA");
            return true;
        }

        System.out.println("Limite insuficiente");
        return false;
    }

    public ContaPF(String numero, double saldo, String titular, double limite, String cpf) {
        super(numero, saldo, titular, limite);
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
                ", cpf=" + this.cpf +
                '}';
    }

    public void echo() {
        System.out.println("Echooo");
    }
}
