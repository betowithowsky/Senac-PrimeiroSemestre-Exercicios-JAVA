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
public class AulaIfElse_Exercicio3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Massa Corpórea
        
        System.out.print("Digite Sua Altura: ");
        double altura = console.nextDouble();
        System.out.print("Digite Seu Peso: ");
        double peso = console.nextDouble();
        
        double massa = peso / Math.pow(altura,2);
        
        if(massa < 26){
        System.out.println("Sua Massa Corpórea está Normal");
        }
        else if(massa >= 26 && massa < 30){
            System.out.println("Sua Massa Corpórea está Obeso");
        }
        else if(massa >= 30){
            System.out.println("Sua Massa Corpórea está Obeso Mórbido");
        }
    }
}
