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
public class Exercicio_Funcao_1 {

    public static void main(String[] args) {
        System.out.println(imprimirNota(6.7));
    }

    static String imprimirNota(double nota) {
        String status;

        if (nota >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        return status;
    }

}
