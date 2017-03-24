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
public class CalculaAreaQuadrado {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //VARIAVEIS
        int base, altura;
        double quadrado;
        
        //ENTRADA
        System.out.println("Calcula a Area do Quadrado");
        System.out.print("Digite a Base do Quadrado: ");
        base = console.nextInt();
        altura = base;
        
        //PROCESSO
        quadrado = base * altura;
        
        //SAIDA
        System.out.println("Base: " + base + "\nAltura: " + altura + "\nO Valor da Area do Quadrado é: " + quadrado);
    }
}
