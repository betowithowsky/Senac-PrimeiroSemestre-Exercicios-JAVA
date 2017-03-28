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
public class AulaIfElse_Exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        //ENTRADA
        System.out.println("Digite um Numero: ");
        int numero = console.nextInt();
        double total;
        
        //PROCESSO
        if(numero > 100){
           total = numero + 150;
        }else{
            total = numero;
        }
        
        //SAIDA
        if(numero > 100){
        System.out.println("Seu Numero é maior que 100 então Seu Numero + 150 é: " +total);
        }else{
            System.out.println("Seu numero não é maior que 100, sue numero é: " +total);
        }
    }
}
