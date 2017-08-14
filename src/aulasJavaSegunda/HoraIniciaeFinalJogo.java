/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class HoraIniciaeFinalJogo {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
    
        System.out.println("Digite a Hora Inical do Jogo:");
        int hInicial = console.nextInt();
        System.out.println("Digite a Hora Final do Jogo:");
        int hFinal = console.nextInt();
        
        if(hInicial <= 24 && hInicial < hFinal){
            int duracao = (hFinal - hInicial);
            System.out.print("O Jogo Durou " + duracao+ " Horas");
        }else if(hInicial <= 24 && hInicial > hFinal){
            int duracao = (24-(hFinal - hInicial));
            System.out.printf("O Jogo Durou " +duracao+ " Horas");
        }else if(hInicial <= 24 && hInicial == hFinal){
            System.out.printf("O Jogo Durou 24 Horas");
        }
    }
}
