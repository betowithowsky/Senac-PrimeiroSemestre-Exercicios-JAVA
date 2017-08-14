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
public class Estrutura_Repeticao_Ex_2 {
    public static void main(String[] args) {
        int soma = 1;
        int index = 0;
        int termo = 1;
        
        
        while(index < 10000){
            System.out.println(soma);
            termo = termo + 2;
            soma = soma + termo;
            index++;
        }
    }
}
