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
public class SalarioPorHora {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        //ENTRADA
        System.out.print("Digite seu Nome: "); 
        String nome = console.next();
        System.out.print("Digite o Valor de Sua Hora de Trabalho: "); 
        double valorHora = console.nextDouble();
        System.out.print("Digite a Quantidade de Horas Trabalhada: ");
        double horasTrab = console.nextDouble();
        
        //PROCESSO
        double salario =  valorHora * horasTrab;
        
        //SAIDA
        System.out.println("O funcionário " +nome+ " trabalhou: " +horasTrab+ " horas por R$ " +valorHora+ " e deve receber R$ " +salario);
        
    }
}
