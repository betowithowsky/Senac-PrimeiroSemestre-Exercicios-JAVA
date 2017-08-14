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
public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("** Calculadora **");
        System.out.print("Digite numA: ");
        double numA = input.nextDouble();
        
        System.out.print("Digite a operação desejada: soma, subtracao, multiplicacao ou divisao: ");
        String operacao = input.next();
        
        System.out.print("Digite o numB: ");
        double numB = input.nextDouble();
        
        double total = 0;
        
        switch(operacao){
            case "soma":
                total = numA + numB;
                System.out.printf("Resultado: %.2f\n", total);
                break;
            case "subtracao":
                total = numA - numB;
                System.out.printf("Resultado: %.2f\n", total);
                break;
            case "multiplicacao":
                total = numA * numB;
                System.out.printf("Resultado: %.2f\n", total);
                break;
            case "divisao":
                total = numA / numB;
                System.out.printf("Resultado: %.2f\n", total);
                break;
            default:
                System.out.println("Operação Invalida!");
        }
    }
}
