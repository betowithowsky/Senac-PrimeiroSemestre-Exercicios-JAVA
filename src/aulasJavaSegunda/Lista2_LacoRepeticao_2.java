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
public class Lista2_LacoRepeticao_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um Numero:");
        int n = input.nextInt();
        int i = 1;
        int r = 0;
        while(i <= n){
            r = r+i;
            System.out.println(r);
            i++;
        }
    }
}
