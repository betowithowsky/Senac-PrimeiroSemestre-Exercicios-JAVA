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
public class TransporteDeMateriais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o Tipo de Material que vai ser Transportado? A, B, C ou D");
        String material = input.nextLine();
        System.out.println("Digite a Temperatura que está no Local de Transporte.");
        double temp = input.nextDouble();
        
        //Material A Cºmin 10 max 17
        //Material B Cºmin 11 max 16
        //Material C Cºmin 12 max 15
        //Material D Cºmin 13 max 14
        
        switch(material){
            case "a":
                if(temp >= 10 && temp <= 17){
                    System.out.println("é possivel Fazer o transporte!");
                }else{
                    System.out.println("Não é possivel fazer o Transporte!");
                }
                break;
            case "b":
                if(temp >= 11 && temp <= 16){
                    System.out.println("é possivel Fazer o transporte!");
                }else{
                    System.out.println("Não é possivel fazer o Transporte!");
                }
                break;
            case "c":
                if(temp >= 12 && temp <= 15){
                    System.out.println("é possivel fazer o transporte!");
                }else{
                    System.out.println("não é possivel fazer o transporte!");
                }
                break;
            case "d":
                if(temp >= 13 && temp <= 14){
                    System.out.println("é possivel fazer o transporte!");
                }else{
                    System.out.println("não é possivel fazer o transporte!");
                }
                break;
            default:
                System.out.println("Material não existe!");
                
        }
        
    }
}
