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
public class Exercicio_Funcao_2 {

    static int maior;

    public static void main(String[] args) {
        
        System.out.println("O Maior Numero é: " + retornaMaior(5,10));
    }

    static int retornaMaior(int a, int b) {
        if (a > b) {
            maior = a;
        } else {
            maior = b;
        }
        return maior;
    }
    
    
}
