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
public class AulaIfElse_Exercicio4 {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //ENTRADA
        System.out.println("Digite o kW/h consumido: ");
        double kwh = console.nextDouble();
        
        double totalPagar = 0;
        
        //PROCESSO
        if(kwh < 150){
            totalPagar = kwh * 0.20;
        }
        else if(kwh >= 150 && kwh < 500){
            totalPagar = kwh * 0.25;
        }
        else{
            totalPagar = kwh * 0.30;
        }
        
        if(totalPagar < 11.90){
            totalPagar = 11.90;
        }
        
        //SAIDA
        System.out.printf("Você Consumiu %.0f kW/h \nValor Total de sua Conta de Luz: R$%.2f "
                          ,kwh 
                          ,totalPagar);
        
    }
}
