/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("* Calculadora *");
        System.out.println("Digite o Numero A");
        double numA = console.nextDouble();
        System.out.println("Digite a Operação Matemática, Soma, Subtração, Multiplicação ou Divisão");
        String operacao = console.next();
        System.out.println("Digite o Numero B");
        double numB = console.nextDouble();
        double total = 0;
        
        if(operacao.equals("soma") || operacao.equals("Soma")){
            total = numA + numB;
        
        }else if(operacao.equals("subtracao")|| operacao.equals("SubtracaSo") || operacao.equals("subtração") || operacao.equals("Subtração")){
            total = numA - numB;
        
        }else if(operacao.equals("multiplicacao") || operacao.equals("Multiplicacao") || operacao.equals("multiplicação") || operacao.equals("Multiplicação") ){
            total = numA * numB;
        
        }else if(operacao.equals("divisao") || operacao.equals("divisão") || operacao.equals("Divisão") || operacao.equals("Divisao")){
            total = numA / numB;
        }
        
        System.out.printf("O Resultado é: %f", total);

    }

}
