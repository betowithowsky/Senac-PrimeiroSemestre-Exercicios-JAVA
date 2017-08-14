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
public class SwitchCase_Ex_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int valor = Integer.parseInt(console.nextLine());
        
        int dinheiro = valor;
        
       
        int notas = (dinheiro/100);
        if(notas >= 1){
            System.out.printf("%d notas de R$ 100,00\n", notas);
            dinheiro -= (notas * 100);
        }
       
        notas = (dinheiro/50);
        if(notas >= 1){
            System.out.printf("%d notas de R$ 50,00\n", notas);
            dinheiro -= (notas * 50);
        }
        
        notas = (dinheiro/10);
        if(notas >= 1){
            System.out.printf("%d notas de R$ 10,00\n", notas);
            dinheiro -= (notas * 10);
        }
        notas = (dinheiro/5);
        if(notas >= 1){
            System.out.printf("%d notas de R$ 5,00\n", notas);
            dinheiro -= (notas * 5);
        }
        notas = (dinheiro/1);
        if(notas >= 1){
            System.out.printf("%d notas de R$ 1,00\n", notas);
            dinheiro -= (notas * 1);
        }
        
        switch(notas){
            case 100:
                System.out.printf("%d notas de R$ 100,00\n", notas);
            case 50:
                System.out.println("aulasJavaSegunda.SwitchCase_Ex_3.main()");
            case 10:
                System.out.println("aulasJavaSegunda.SwitchCase_Ex_3.main()");
            case 5:
                System.out.println("aulasJavaSegunda.SwitchCase_Ex_3.main()");
            case 1:
                System.out.println("aulasJavaSegunda.SwitchCase_Ex_3.main()");
        }
        
    }
}
