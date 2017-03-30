/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class CalculaQuadradoeCirculo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um Numero L para o Quadrado: ");
        double l = console.nextDouble();
        System.out.println("Digite um Numero R para o Raio do Circulo: ");
        double r = console.nextDouble();
        
        double baseQuadrado = l;
        double pi = 3.14;
        
        double areaQuadrado = l * baseQuadrado;
        double areaCirculo = pi * Math.pow(r,2);
        
        if(areaQuadrado > areaCirculo){
            System.out.printf("A Area do Quadrado é Maior, Area Quadrado: %.2f cmª", areaQuadrado);
        }else{
            System.out.printf("A Area do Circulo é Maior, Area do Cirulo: %.2f cmª", areaCirculo);
        }
        
    }
}
