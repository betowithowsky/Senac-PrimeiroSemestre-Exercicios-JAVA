/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos2tads;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class Algoritimos2Exercicio02 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        do{
        System.out.println("Digite Numeros maior ou igual a Zero");
        System.out.println("Digite o primeiro numero:");
        num1 = input.nextInt();
 
        System.out.println("Digite o segundo numero:");
        num2 = input.nextInt();
        }while(num1 <= 0 || num2 <= 0);
        
        System.out.println(SomadoisNumeros(num1, num2));
    }
    
    
    public static int SomadoisNumeros(int num1,int num2){
        int resultado = num1 + num2;
        
        return resultado;
    }
}
