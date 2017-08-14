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
public class Estrutura_Repeticao_Ex_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dig = 0;
        int r = 0;
        int soma = 0;
        
        System.out.println("Digite Numeros:");
        String nums = input.next();
        
        for(int i = 0;i < nums.length();i++){
            dig = Integer.parseInt(nums.substring(i,i+1));
            int mult = nums.length()-i;
            r = dig*mult;
            soma = soma + r;
            System.out.printf("%d x %d\n",dig,mult);
            
            
        }
        System.out.println("= " +soma);
    }
}
