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
public class Valores_AceitosNaceitos {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            
            System.out.println("Digite NumA: ");
            int numA = console.nextInt();
            System.out.println("Digite NumB: ");
            int numB = console.nextInt();
            System.out.println("Digite NumC: ");
            int numC = console.nextInt();
            System.out.println("Digite NumD: ");
            int numD = console.nextInt();
            
            
        if(numB > numC && numD > numA && numC+numD > numA+numB && numC > 0 && numD > 0 && numA%2==0){
            System.out.println("Valor Aceito");
        }else{
            System.out.println("Valor não Aceito");
        }
    }
}
