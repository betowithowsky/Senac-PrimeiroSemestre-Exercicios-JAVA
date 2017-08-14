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
public class Triangulo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite Numero A:");
        double numA = console.nextInt();
        System.out.println("Digite Numero B:");
        double numB = console.nextInt();
        System.out.println("Digite Numero C:");
        double numC = console.nextInt();
        
         double aux;
        
        if(numA < numB){
            aux = numA;
            numA = numB;
            numB = aux;
        }
        
        if(numA < numC){
            aux = numA;
            numA = numC;
            numC = aux;
        }
        
        if(numB < numC){
            aux = numB;
            numB = numC;
            numC = aux;
        }
        
        if(numA >= (numB+numC)){
            System.out.println("NAO FORMA TRIANGULO"); //se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
        }else{
            if(numB == numA && numB == numC){
                System.out.println("TRIANGULO EQUILATERO"); //se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
            }
            if(numB == numA && numC != numA ||
               numB == numC && numA != numC){ 
                System.out.println("TRIANGULO ISOSCELES"); //se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
            }
            if(numB != numA && numB != numC && numA != numC){
                System.out.println("TRIANGULO ESCALENO");
            }
        }
        System.out.printf("Maior: %f\nMedio: %f\nMenor: %f",numA, numB, numC);
        
    }
}
