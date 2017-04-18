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
public class Estrutura_Repeticao_Ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Numero:");
        String n = input.next();
        int soma = 0;
        int dig = 0;
        
        for(int i = 0; i < n.length(); i++){
            dig = Integer.parseInt(n.substring(i,i+1));
        
            soma = soma + dig;
        }
        
        System.out.println(soma + dig);
    }
}
