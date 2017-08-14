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
        
        double imc = peso / Math.pow(altura,2);
        
        if(imc < 18.5){
        System.out.println("Abaixo do Peso");
        }
        else if(imc < 25){
            System.out.println("Peso Normal");
        }
        else if(imc < 30){
            System.out.println("Acima Do Peso");
        }
        else if(imc >= 30){
            System.out.println("Obesidade");
        }
    }
}
