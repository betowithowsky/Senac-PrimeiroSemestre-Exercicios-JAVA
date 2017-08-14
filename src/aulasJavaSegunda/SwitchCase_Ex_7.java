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
public class SwitchCase_Ex_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o Valor ");
        double valor = input.nextDouble();
        System.out.println("Digite o mes a ser pago de 1 a 12:");
        int mes = input.nextInt();
        
        double juros = 5;
        double total = 0;
        
        
        
        switch(mes){
            case 1:
                total = valor;
                System.out.printf("Valor total a pagar: %.2f\n", total);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                juros = (Math.pow((1+juros/100),mes-1) -1) * 100;
                total = juros + valor;
                System.out.printf("Juros percentuais(JP)  =  %.2f  \nValor dos juros (VJ)  =  %.2f * JP  =  15,7625\nValor total com juros  =  %.2f + %.2f  =  R$%.2f\n",
                juros,
                valor,
                juros,
                valor,
                total);
                break;
            default:
                System.out.println("Mês não existente!");
                
                
        }
       
    }
}
