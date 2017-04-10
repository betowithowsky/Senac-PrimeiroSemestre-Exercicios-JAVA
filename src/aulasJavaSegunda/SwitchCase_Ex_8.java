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
public class SwitchCase_Ex_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Digite um numero de CPF:");
        String cpf = input.nextLine();
        
        int soma = (Integer.parseInt(cpf.substring(0,1)) * 10) +
                   (Integer.parseInt(cpf.substring(1,2)) * 9) +
                   (Integer.parseInt(cpf.substring(2,3)) * 8) +
                   (Integer.parseInt(cpf.substring(3,4)) * 7) +
                   (Integer.parseInt(cpf.substring(4,5)) * 6) +
                   (Integer.parseInt(cpf.substring(5,6)) * 5) +
                   (Integer.parseInt(cpf.substring(6,7)) * 4) +
                   (Integer.parseInt(cpf.substring(7,8)) * 3) +
                   (Integer.parseInt(cpf.substring(8,9)) * 2);
        
        double resultado = 11 - (soma % 11);
        boolean estaValido = false;
        
        if(resultado < 10 && resultado == Integer.parseInt(cpf.substring(9,10)) ||
           resultado < 10 && Integer.parseInt(cpf.substring(9, 10)) == 0) {
            System.out.println("CPF valido");
        } else {
            System.err.println("CPF invalido");
        }
        
        
    }
}
