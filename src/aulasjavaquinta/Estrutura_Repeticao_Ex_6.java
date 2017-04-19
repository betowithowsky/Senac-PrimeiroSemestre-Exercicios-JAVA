/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class Estrutura_Repeticao_Ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();
        
        int numSorteado = gerador.nextInt(11);
        int numPlayer;
        int count = 0;
                
        do{
            System.out.println("Adivinhe o Numero X de 0 á 10:");
            numPlayer = input.nextInt();
            if(numPlayer < numSorteado){
                System.out.println("Errou... o numero X é maior que "+numPlayer);
                count++;
            }else if(numPlayer > numSorteado){
                System.out.println("Errou... o Numero X é Menor que "+numPlayer);
                count++;
            }else if(numPlayer == numSorteado){
                System.out.println("Parabéns... Acertou!!! tentativas: "+count);
                break;
            }
        }while(numPlayer != numSorteado);
    }
}
