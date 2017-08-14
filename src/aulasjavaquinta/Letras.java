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
public class Letras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma letra para saber se é vogal ou consoante");
        char letra = input.nextLine().toUpperCase().charAt(0);
        
        switch(letra){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf("a Letra %s é uma vogal\n",letra);
                break;
            default:
                System.out.printf("A letra %s é uma consoante\n", letra);
        }
    }
}
