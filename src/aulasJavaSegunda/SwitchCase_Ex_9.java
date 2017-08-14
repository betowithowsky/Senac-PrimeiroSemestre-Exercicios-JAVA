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
public class SwitchCase_Ex_9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        double numeroA = Integer.parseInt(console.nextLine());
        
        System.out.println("Digite um segundo numero: ");
        double numeroB = Integer.parseInt(console.nextLine());
        
        System.out.println("Escolha um operadora entre (+, -, *, /): ");
        char operador = console.nextLine().charAt(0);
        
        double resultado = 0;
        switch(operador) {
            case '+':
                resultado = numeroA + numeroB;
                System.out.println("Resultado da soma: " + numeroA + " " + operador + " " + numeroB + " = " + resultado);
                break;
            case '-':
                resultado = numeroA - numeroB;
                System.out.println("Resultado da subtração: " + numeroA + " " + operador + " " + numeroB + " " + " = " + resultado);
                break;
            case '*':
                resultado = numeroA * numeroB;
                System.out.println("Resultado da multiplicação: " + numeroA + " " + operador + " " + numeroB + " " + " = " + resultado);
                break;
            case '/':
                resultado = numeroA / numeroB;
                System.out.println("Resultado da divisão: " + numeroA + " " + operador + " " + numeroB + " " + " = " + resultado);
                break;
            default:
                System.err.println("Operador invalido");
                break;
        }
    }
    
}
