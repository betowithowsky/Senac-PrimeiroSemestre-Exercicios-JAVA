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
public class SwitchCase_Ex_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite um Numero Divisivel ou Não por 3:");
        int numA = Integer.parseInt(console.nextLine());
        
        int resto = numA % 3;
        
        System.out.println(resto);
        switch( resto){
            case 0:
                    System.out.println("é Divisivel por 3");
                    break;
            default:
                    System.out.println("Não é Divisivel");
        }
        
        
    }
}
