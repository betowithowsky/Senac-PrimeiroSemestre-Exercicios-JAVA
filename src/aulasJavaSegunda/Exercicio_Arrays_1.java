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
public class Exercicio_Arrays_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int[]v = new int[10];
        
        for(int i = 0; i < n; i++){
            System.out.println("Digite um Numero:");
            v[i] = input.nextInt();
        }
        
        int soma = 0;
        int menor = v[0];
        int maior = v[0];
                
        int[] vetorB = copiaValor(v);
        
        int[] vetorC = recebeValores(v, vetorB);
        
        for (int i = 0; i < n; i++){
            soma = soma + v[i];
            
            if(v[i] < menor)
                menor = v[i];
            
            if(v[i] > maior)
                maior = v[i];
        }
        
        for(int i = 0; i < n; i++){
            System.out.print("v["+i+"]"+v[i]);
            
            if(v[i] == menor)
                System.out.print(" <--- menor");
            if(v[i] == maior)
                System.out.print(" <---- maior");
            
            System.out.println("");
        }
        
        System.out.println("Soma: " + soma);
        
    }
    
    public static int[] copiaValor(int[] vetor){
        return vetor;
    }
    
    public static int[] recebeValores(int[] vetorA, int[] vetorB){
        int[] vetorC = new int[vetorA.length];
        
        for(int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("VetorC ["+i+"]"+vetorC[i]);
        }
        return vetorC;
    }
    
    public static int[] uniVetores(int[] vetorA, int[] vetorB){
        int[] vetorD = new int[vetorA.length + vetorB.length];
        
        for(int i = 0; i < vetorA.length; i++){
            
            vetorD[i] = vetorA[i];
        }
        int inicia = vetorA.length;
        
        for(int i = 0; i < vetorB.length; i++){
            vetorD[inicia + i] = vetorB[i];
        }
        return vetorD;
    }
}
