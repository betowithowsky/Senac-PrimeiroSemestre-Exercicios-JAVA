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
public class Lista2_LacoRepeticao_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeMaior = "";
        int i = 1;
        String sexoMaior = "";
        int idadeMaior = 0;
        
        do{
            System.out.printf("Digite o nome do Aluno(%d):",i);
            String nome = input.next();
            System.out.printf("Digiete a idade do Aluno(%d):",i);
            int idade = input.nextInt();
            System.out.printf("Digite o Sexo do Aluno(%d):",i);
            String sexo = input.next();
            i++;
            
            if(idade > idadeMaior){
                nomeMaior = nome;
                sexoMaior = sexo;
                idadeMaior = idade;
            }
            
        }while(i <= 5);
        System.out.printf("O Aluno mais Velhor é o %s com %d de idade do sexo %s\n",
                nomeMaior,
                idadeMaior,
                sexoMaior);
    }
   
}
