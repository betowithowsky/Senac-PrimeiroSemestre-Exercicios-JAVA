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
        System.out.println("Digite o Numero de Horas Trabalhada: ");
        double numHoras = console.nextDouble();
        System.out.println("Digite o Valor que Recebe por Hora Trabalhada: ");
        double valorHoras = console.nextDouble();
        
        double salario = numHoras * valorHoras;
        
        System.out.printf("O Funcionario %s, Trabalhou %.0f Horas e Recebera: R$%.2f ",
                nome,
                numHoras,
                salario);
    }
}
