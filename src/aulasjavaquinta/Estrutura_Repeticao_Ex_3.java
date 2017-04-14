/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

/**
 *
 * @author roberto.jwsilva
 */
public class Estrutura_Repeticao_Ex_3 {
    public static void main(String[] args) {
        int soma = 1;
        int index = 0;
        double r = 0;
        
        while(index < 10000){
            soma = soma + 2;
            r += (1.0 / soma);
            System.out.println(r);
            index++;
        }
        
    }
   
}
