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
public class ListaFuncoes_Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.println("Digite o Valor A:");
        int a = input.nextInt();
        System.out.println("Digite o Valor B:");
        int b = input.nextInt();
        System.out.println("Digite o Valor C:");
        int c = input.nextInt();
              
        System.out.println(retornaMenor(a,b,c));
    }
    public static int retornaMenor(int a, int b, int c){
            if(a < b && a < c){
                return a;
            }else if(b < a && b < c){
                return b;
            }
            return c;
        }
}
