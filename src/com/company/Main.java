package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] matrizNotasAlunos = {{7,8,7}, {10,8,9}, {5,4,3}, {2, 1, 0}};
        int[][] matrizDias = {{5, 2, 1}, {2, 1, 0}, {5, 1 ,3}, {2, 1, 0}};

        Carro[] carros = new Carro[2];

        Carro carro = new Carro();
        carro.marca = "Hyundai";
        carro.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Chevrolet";
        carro2.ano = 2016;

        carros[0] = carro;
        carros[1] = carro2;

        for(Carro carroi : carros) {
            System.out.println("Marca: " + carroi.marca);
            System.out.println("Ano: " + carroi.ano);
        }

        /*for (int[] aluno : matrizNotasAlunos) {
            for (int nota : aluno) {
                System.out.println("Nota: " + nota);
            }
        }*/

        int[][] matrizInteiros = new int[2][2]; // = {{10, 8}, {8, 7}}
        matrizInteiros[0][0] = 10;
        matrizInteiros[0][1] = 8;

        matrizInteiros[1][0] = 8;
        matrizInteiros[1][1] = 7;

        /*for(int aluno = 0; aluno < 4; aluno++) {
            for(int nota = 0; nota < 3; nota++) {
                System.out.println("Nota " + (nota + 1) + ": " + matrizNotasAlunos[aluno][nota]);
            }
            System.out.println("");
        }*/

        /*for(int x = 0; x < 3; x++) {
            int dias = 0;
            for (int y = 0; y < 3; y++) {
                dias = dias + matrizDias[x][y];
            }
            System.out.println("Total de dias: " + dias);
        }*/

    }

    static class Carro {
        int ano;
        String marca;
    }
}
