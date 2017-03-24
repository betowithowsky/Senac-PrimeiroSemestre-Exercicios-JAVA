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
public class CalculaHipotenusa {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //VARIAVEIS
        float catetoA, catetoB;
        double hipotenusa;
        
        
        //ENTRADA
        System.out.println("Calcula o Valor da Hipotenusa");
        System.out.print("Digite o valor do Cateto 1: ");
        catetoA = console.nextFloat();
        System.out.print("Digite o valor do Cateto 2: ");
        catetoB = console.nextFloat();
        
        //PROCESSO
        hipotenusa = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);
        hipotenusa = Math.sqrt(hipotenusa);
        
        //SAIDA
        System.out.println("O Valor da Hipotenusa é: " + hipotenusa);
    }
}
