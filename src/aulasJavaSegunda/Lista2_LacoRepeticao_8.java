/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

/**
 *
 * @author Beto
 */
public class Lista2_LacoRepeticao_8 {
    public static void main(String[] args) {
        double media = 0;
        int count = 0;
        int soma = 0;
        int par = 0;
        
        for(int i = 13;i <= 73;i++){
            if(i%2==0){
                System.out.println(i);
                par = i;
                count++;
                soma = soma+par;

            }
        }

        media = soma/count;
        System.out.println("soma"+soma);
        System.out.println("count"+count);
        System.out.println("media"+media);
    }
}
