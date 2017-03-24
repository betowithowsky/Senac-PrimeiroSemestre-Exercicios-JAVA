/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

import java.util.Scanner; //importação do Scanner

/**
 *
 * @author roberto.jwsilva
 */
//CLASSE
public class CalculoMediaPonderada {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in); //le os dados recebido
        
        //VARIAVEIS  
        
        String nome;
        float n1,n2;
        float P1,P2;
        P1 = 0.4f;
        P2 = 0.6f;
        
        float media;
        
        //ENTRADA
        System.out.println("Calculo Média Ponderada");
        System.out.print("Digite seu Nome: ");
        nome = console.next();
        System.out.print("Nota 1: ");
        n1 = console.nextFloat();
        System.out.print("Nota 2: ");
        n2 = console.nextFloat();
        
        //PROCESSAMENTO
        media = (n1*P1) + (n2*P2);
        
        //SAIDA
        System.out.printf("%s \nSua Média é: %.2f ", nome , media);
        
        
        
    }
}
