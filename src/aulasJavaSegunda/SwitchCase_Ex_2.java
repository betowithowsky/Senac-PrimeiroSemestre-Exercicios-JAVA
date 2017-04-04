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
public class SwitchCase_Ex_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um Dia de 1 a 7 Domingo é 1 e Sabado é 7");
        int dia = Integer.parseInt(console.nextLine());
        
        switch(dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia ùtil");
                break;
            case 7:
            case 1:
                System.out.println("Fim de Semana!");
                break;
            default:
                System.out.println("Dia Invalido");
        }
    }
}
