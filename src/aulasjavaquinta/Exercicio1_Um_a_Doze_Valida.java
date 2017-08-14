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
public class Exercicio1_Um_a_Doze_Valida {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um Numero de 1 a 12 para saber o seu Dobro:");
        double numA = console.nextInt();
        
        double total = numA * 2;
        
        if(numA < 1 || numA > 12){
            System.out.println("Erro... Seu Numero é Menor que 1 ou maior que 12");
        }else{
            System.out.printf("O Dobro de %.2f é %.2f", numA, total);
        }
    }
}
