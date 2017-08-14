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
public class Aula_SwitchCase_0 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        char grade = console.nextLine().toUpperCase().toCharArray()[0];
        
        switch( grade){
            case 'A':
                System.out.print("Exelente!");
                break;
            case 'B':
            case 'C':
                System.out.println("Bem Feito!");  
                break;
            case 'D':
                System.out.println("Você Passou!");
            case 'E':
                System.out.println("Melhor tentar novamente");
                break;
            default:
                    System.out.println("Conceito Invalido!");
    }
    }
}
