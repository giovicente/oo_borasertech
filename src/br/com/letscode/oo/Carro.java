package br.com.letscode.oo;

public class Carro {
    String placa;
    String cor;
    String modelo;
    int quantidadePorta;
    boolean totalFlex;
    String categoria;
    double velocidade;
    double velocidadeMaxima;

    Carro(String placa) {
        System.out.println("Estou chamando o construtor de placa");
    }

    Carro(String placa, String cor) {
        System.out.println("Estou chamando o construtor de placa e cor");
    }

    Carro() {
        System.out.println("Estou chamando o construtor vazio");
    }

    void acelerar(double valor) {
        if ((this.velocidade + valor) < velocidadeMaxima) {
            System.out.println("Estou acelerando...");
            this.velocidade += valor;
            System.out.println("Velocidade atual: " + this.velocidade);
        }
    }

    void liga() {
        System.out.println("Estou ligando...");
    }

    void trocaMarcha() {
        System.out.println("Estou trocando a marcha");
    }

    void ligaFarol() {
        System.out.println("Estou ligando o farol...");
    }
}
