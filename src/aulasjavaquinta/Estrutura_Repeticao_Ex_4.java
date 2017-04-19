/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

/**
 *
 * @author Beto
 */
public class Estrutura_Repeticao_Ex_4 {
    public static void main(String[] args) {
        double soma = 0;
        int index = 0,n = 1;
        while(index < 10000) {
            if(index % 2 == 0)
                soma = soma + (1.0/n);
            else
                soma = soma - (1.0/n);
            n = n + 2;
            index++;
        }
        double PI = soma * 4;
        System.out.println("A soma total é " + PI);        
    }
}
