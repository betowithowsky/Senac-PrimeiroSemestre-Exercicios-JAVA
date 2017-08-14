/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

/**
 *
 * @author roberto.jwsilva
 */
public class ListaFuncoes_Ex6 {

    public static void main(String[] args) {
        System.out.println(maiorOuMenorRaiz(1, -5, 6, 1));
    }

    public static double maiorOuMenorRaiz(int a, int b, int c, int d) {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Não existe Raiz Real");
            return -1;
        } else if (delta == 0) {
            return 0;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (d == 1) { //MAIOR raiz
            if (x1 < x2) {
                System.out.println("Maior Raiz");
                return x2;
            } else {
                System.out.println("Maior Raiz");
                return x1;
            }
        }

        if (x1 > x2) {
            System.out.println("Menor Raiz");
            return x2;
        }
        System.out.println("Menor Raiz");
        return x1;

    }
}
