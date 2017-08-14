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
public class CalculaSalarioFuncionario {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Funcionario:");
        String nome = console.next();
        System.out.println("Digite Seu Nivel de 1 a 5: ");
        int nivel = console.nextInt();
        System.out.println("Digite a Quantidade de Horas Trabalhada: ");
        double numHoras = console.nextDouble();
        
        double valorHoras = 0;
        
        if(nivel == 1){
            valorHoras = 15.00;
        }
        else if(nivel == 2){
            valorHoras = 18.00;
        }
        else if(nivel == 3){
            valorHoras = 22.00;
        }
        else if(nivel == 4){
            valorHoras = 27.00;
        }
        else if(nivel == 5){
            valorHoras = 33.00;
        }
        
        
        double salario = numHoras * valorHoras;
        System.out.printf("O Funcionario %s, Trabalhou %.0f Horas por R$ %.2f (Nivel: %d) e deve Receber: R$%.2f ",
                nome,
                numHoras,
                valorHoras,
                nivel,
                salario);
    }
}
