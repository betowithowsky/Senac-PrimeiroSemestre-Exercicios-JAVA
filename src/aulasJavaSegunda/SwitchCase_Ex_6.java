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
public class SwitchCase_Ex_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite do conveniado: ");
        int idade = input.nextInt();
        
        double fixo = 100.00;
        int valor = 0;
        double total = 0;
        
        if(idade < 10){
            valor = 80;
        }else if(idade >= 10 && idade <= 30){
            valor = 50;
        }else if(idade >= 40 && idade <=60){
            valor = 95;
        }else{
            valor = 130;
        }
        
        switch(valor){
            case 80:
                total = valor + fixo;
                System.out.printf("O valor fixo é de R$: %.2f\nCriança com menos de 10 anos pagam R$: %d,00\nTotal a Pagar: %.2f\n",
                        fixo,
                        valor,
                        total);
                break;
            case 50:
                total = valor + fixo;
                System.out.printf("O valor fixo é de R$: %.2f\nConveniados com idade entre 10 e 30 anos pagam R$: %d,00\nTotal a Pagar: %.2f\n",
                        fixo,
                        valor,
                        total);
                break;
            case 95:
                total = valor + fixo;
                System.out.printf("O valor fixo é de R$: %.2f\nConveniados com idade entre 40 e 60 anos pagam R$: %d,00\nTotal a Pagar: %.2f\n",
                        fixo,
                        valor,
                        total);
                break;
            case 130:
                total = valor + fixo;
                System.out.printf("O valor fixo é de R$: %.2f\nConveniados com mais de 60 anos pagam R$: %d,00\nTotal a Pagar: %.2f\n",
                        fixo,
                        valor,
                        total);
                break;
                
        }
        
        
        
        
    }
}
