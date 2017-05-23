/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class Exercicio_Funcao_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Numero A: ");
        int a = input.nextInt();
        System.out.println("Digite o Numero B: ");
        int b = input.nextInt();

        System.out.println("Escolha o Calculo: (1) Soma / (2) Multiplicação / (3) Subtração / (4) Divisão / (5) Raiz / (6) Potencia");
        int tipo = input.nextInt();

        switch (tipo) {
            case 1:
                System.out.println(soma(a, b));
                break;
            case 2:
                System.out.println(multiplicacao(a, b));
                break;
            case 3:
                System.out.println(subtração(a, b));
                break;
            case 4:
                System.out.println(divisao(a, b));
                break;
            case 5:
                System.out.println(raiz(a));
                break;
            case 6:
                System.out.println(potencia(a, b));
                break;

        }
    }

    static int soma(int a, int b) {
        return (a + b);
    }

    static int multiplicacao(int a, int b) {
        return (a * b);
    }

    static double subtração(int a, int b) {
        return (a - b);
    }

    static double divisao(int a, int b) {
        return (a / b);
    }

    static double raiz(int a) {
        return Math.sqrt(a);
    }

    static double potencia(int a, int b) {
        return Math.pow(a, b);
    }

}
