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
public class CalculaTriangulos {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite Numero A:");
        double numA = console.nextInt();
        System.out.println("Digite Numero B:");
        double numB = console.nextInt();
        System.out.println("Digite Numero C:");
        double numC = console.nextInt();
        
        double min = 0;
        double med = 0;
        double max = 0;
        
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
            if(Math.pow(numA, 2) == (Math.pow(numB, 2)+Math.pow(numC, 2))){
                System.out.println("TRIANGULO RETANGULO"); //se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
            }
            if(Math.pow(numA, 2) > (Math.pow(numB, 2)+Math.pow(numC, 2))){
                System.out.println("TRIANGULO OBTUSANGULO"); //se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
            }
            if(Math.pow(numA, 2) < (Math.pow(numB, 2)+Math.pow(numC, 2))){
                System.out.println("TRIANGULO ACUTANGULO"); //se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
            }
        }
        System.out.printf("Maior: %f\nMedio: %f\nMenor: %f",numA, numB, numC);
        
    }
}
