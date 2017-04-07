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
public class SwitchCase_Ex_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um mês para saber se é alta ou baixa temporada!");
        String mes = console.next();
        
        switch(mes){
            case "dezembro":
            case "fevereiro":
            case "junho":
            case "julho":
                System.out.printf("%s é um mês de alta temporada!\n", mes);
                break;
            default:
                System.out.printf("%s é um mês de baixa temporada!\n", mes);
        }
    }
}
