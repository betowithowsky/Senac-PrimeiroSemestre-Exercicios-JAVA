/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class Exercicio_MediaAluno {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite sua Nota da Primeira Prova: ");
        double p1 = console.nextDouble();
        System.out.println("Digite sua Nota da Segunda Prova: ");
        double p2 = console.nextDouble();
        System.out.println("Digite Sua Frequencia em Aulas em Porcentagem: ");
        double f = console.nextDouble();
        
        double p3;
        double totalNota = 0;
        totalNota = (p1+p2) / 2;
        if(f >= 75){
            if(totalNota >= 6.0){
                System.out.printf("Sua Notal final é: %.2f, Você Passou!!", totalNota);
            }else{
                System.out.println("Sua Nota Está Abaixo de 6,0\ndigite a nota da Terceira Prova: ");
                p3 = console.nextDouble();
                if(p1 <= p2){
                    p1 = p3;
                    totalNota = (p1+p2) / 2;

                }else{
                    p2 = p3;
                    totalNota = (p1+p2) / 2;
                }
                
                if(totalNota >= 6.0){
                    System.out.printf("Sua Notal final é: %.2f, Você Passou!!", totalNota);
                    }else if(totalNota < 6.0){
                    System.out.printf("Sua Notal final é: %.2f, REPROVADO!! ", totalNota);
                    }
            }
        }else{
            System.out.println("Você já está automaticamente Reprovador por Faltas!!");
}
}
