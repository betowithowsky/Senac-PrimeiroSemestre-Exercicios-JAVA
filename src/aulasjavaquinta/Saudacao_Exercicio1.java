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
public class Saudacao_Exercicio1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        String nome;
        
        System.out.print("Digite Seu Nome:");
        nome = console.nextLine();
        
        if(nome.equals("")){
            System.out.println("Olá, Mundo");
        }else{
            System.out.printf("Olá, %s", nome);
        }
    }

}
