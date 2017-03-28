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
public class CalculaTotalSalarioVendedor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Vendedor: ");
        String nome = console.next();
        System.out.println("Digite o seu Salario Fixo: ");
        double salarioFixo = console.nextDouble();
        System.out.println("Digite o Total em Vendas no Mês (em Dinheiro): ");
        double totalVendas= console.nextDouble();
        
        double valorVendas = (totalVendas * 15) / 100;
        double salarioTotal = salarioFixo + valorVendas;
        
        System.out.printf("O Vendedor %s, Ganhou de Comissão R$%.2f e Recebendo de Salario: R$%.2f ",
                nome,
                valorVendas,
                salarioTotal);
    }
}
