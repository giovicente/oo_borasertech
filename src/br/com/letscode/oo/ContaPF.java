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

        System.out.println("Limite insuficiente para a operação");
        return false;
    }

    public ContaPF() {
    }

    public ContaPF(String numero, double saldo, String titular, double limite, String cpf) {
        super(numero, saldo, titular, limite);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ContaPF{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                ", limite='" + limite + '\'' +
                ", cpf=" + cpf +
                '}';
    }

}
