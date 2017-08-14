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
public class TipoSanguineo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite Seu Tipo Sanguíneo(AB+, AB-, O+, O-:");
        String tipo = console.nextLine();
        
        if(tipo.equals("ab+") || tipo.equals("AB+")){
            System.out.printf("Qual seu tipo sanguíneo: %s\nVocê pode doar para: AB+ \nVocê pode receber de: A+, A-, B+, B-, AB+, AB-, O+ e O-\n", tipo);
        }else if(tipo.equals("ab-") || tipo.equals("AB-")){
            System.out.printf("Qual seu tipo sanguíneo: %s\nVocê pode doar para: AB+ e AB- \nVocê pode receber de: A-, B-, AB- e O-\n", tipo);
        }else if(tipo.equals("o+") || tipo.equals("0+")){
            System.out.printf("Qual seu tipo sanguíneo: %s\nVocê pode doar para: A+, B+, AB+ e O+ \nVocê pode receber de: O+ e O-\n", tipo);
        }else if(tipo.equals("o-") || tipo.equals("O-")){
            System.out.printf("Qual seu tipo sanguíneo: %s\nVocê pode doar para: A+, A-, B+, B-, AB+, AB-, O+ e O- \nVocê pode receber de: O-\n",tipo);
        }
    }

}
