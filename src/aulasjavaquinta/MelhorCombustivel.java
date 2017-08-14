/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class MelhorCombustivel {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite a distancia percorrida em Km");
        double kmPercorrido = console.nextDouble();
        System.out.println("Digite a quantidade de Gasolina utilizada");
        double litrosG = console.nextDouble();
        System.out.println("Digite a quantidade de Álcool utilizado");
        double litrosA = console.nextDouble();
        System.out.println("Informe o Preço da Gasolina: ");
        double custoG = console.nextDouble();
        System.out.println("Informe o Preço da Álcool: ");
        double custoA = console.nextDouble();
        
        double kmlG = kmPercorrido / litrosG;
        double kmlA = kmPercorrido / litrosA;
        double totalG = litrosG * custoG;
        double totalA = litrosA * custoA;

        System.out.println(totalG);
        System.out.println(totalA);
        //double custoG = 3.691;
        //double custoA = 2.547;

        if (totalG < totalA) {
            System.out.println("A Melhor Opção a se usar é a Gasolina");
        }else{
            System.out.println("A Melhor Opção a se usar é Alcool");
        }

    }
}
