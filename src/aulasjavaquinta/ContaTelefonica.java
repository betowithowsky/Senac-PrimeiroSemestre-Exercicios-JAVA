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
public class ContaTelefonica {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //Exercicio Conta Telefonica
        //Assinatura: R$ 23,32
        //Ligações Locais: R$ 0,09 / min
        //Ligações Interurbanas (DDD): R$ 0,26 / min
        //Ligações Internacionais (DDI): R$ 0,86 / min
        
        //ENTRADA
        System.out.println("Digite os minutos em Ligações Locais: ");
        double tempoLigacao = console.nextDouble();
        System.out.println("Digite os minutos em Ligações Interurbanas: ");
        double tempoInterurbanas = console.nextDouble();
        System.out.println("Digite os minutos em Ligações Internacionais: ");
        double tempoInternacionais = console.nextDouble();
        
        
        //PROCESSO
        double totalMinutos = tempoLigacao + tempoInterurbanas + tempoInternacionais;
        double assinatura = 23.32;
        double ligLocais = (0.09 * tempoLigacao); 
        double ligInterurbanas = (0.26 * tempoInterurbanas);
        double ligInternacionais = (0.86 * tempoInternacionais); 
        double totalConta = assinatura + ligLocais + ligInterurbanas + ligInternacionais;
        
        //SAIDA
        System.out.printf("Duração Total em Ligaçôes Telefonicas Foi de %.0f/Min. \n" + 
                            "Valor Gasto em Ligações Locais foi de: %.2f R$ \n" +
                            "Valor Gasto em Ligações Interurbanas foi de: %.2f R$ \n" +
                            "Valor Gasto em Ligações Internacionais foi de: %.2f R$ \n" +
                            "Valor Assinatura de R$23,32 + total da Conta: %.2f R$",
                            totalMinutos,
                            ligLocais,
                            ligInterurbanas,
                            ligInternacionais,
                            totalConta);
        
        
        
        
    }
}
