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
public class VerificaNumeroNegativo {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
    
    System.out.println("Digite um Numero Negativo ou Positivo: ");
    double numA = console.nextDouble();
    
    if(numA < 0){
        System.out.println("Isso é um Numero Negativo");
    }else{
        System.out.println("Isso é um Numero Positivo");
        }
    }
}