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
public class NumeroConsecutivo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //VARIAVEIS
        int numero1,numero2;
        int r1,r2;
        
        System.out.print("Digite o Primeiro Numero: ");
        numero1 = console.nextInt();
        System.out.print("DIgite o Segundo Numero: ");
        numero2 = console.nextInt();
        
        //PROCESSO
        r1 = numero1 + 1;
        r2 = numero2 + 1;
        
        //SAIDA
        System.out.println("O Consecutivo de " + numero1 + " é: " + r1);
        System.out.println("O Consecutivo de " + numero2 + " é: " + r2);
        
    }
}
