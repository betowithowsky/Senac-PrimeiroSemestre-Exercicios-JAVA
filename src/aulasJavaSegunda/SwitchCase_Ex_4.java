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
public class SwitchCase_Ex_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Digite o Mês:");
        int mes = console.nextInt();
        System.out.println("Digite o Ano:");
        int ano = console.nextInt();
        
        double total = ano % 4; 
        System.out.println(total);
        
        switch(mes){
            case 1:
                System.out.println("Janeiro tem 31 dias, do ano " + ano);
                break;
            case 2:
                if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                    System.out.println("Fevereiro tem 29 dias, do ano " +ano+ "Bissexto");
                    break;
                }else{
                    System.out.println("Fevereiro tem 28 dias, do ano " +ano);
                    break;
                }
            case 3:
                System.out.println("Março tem 31 dias, do ano " + ano);
                break;
            case 4:
                System.out.println("Abril tem 30 dias, do ano " + ano);
                break;
            case 5:
                System.out.println("Maio tem 31 dias, do ano " + ano);
                break;
            case 6:
                System.out.println("Junho tem 30 dias, do ano " + ano);
                break;
            case 7:
                System.out.println("Julho tem 31 dias, do ano " + ano);
                break;
            case 8:
                System.out.println("Agosto tem 31 dias, do ano " + ano);
                break;
            case 9:
                System.out.println("Setembro tem 30 dias, do ano " + ano);
                break;
            case 10:
                System.out.println("Outubro tem 31 dias, do ano " + ano);
                break;
            case 11:
                System.out.println("Novembro tem 30 dias, do ano " + ano);
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias, do ano " + ano);
                break;
            default:
                System.out.println("Mês Invalido");
        }
    }
}
