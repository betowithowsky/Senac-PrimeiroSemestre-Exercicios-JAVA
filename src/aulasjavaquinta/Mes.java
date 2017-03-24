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
public class Mes {
    
    public enum NomeMes {
	J(11),Q(12),K(13),A(14);

	public int valorCarta;
	CartasEnum(int valor) {
		valorCarta = valor;
	}
}
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //ENTRADA
        System.out.print("Mês: ");
        int dias;
        int mes = console.nextInt();
        
        //PROCESSAMENTO
        
        if(mes == 2){
            dias = 28;
        }else{
            if(mes==4 || mes ==6 || mes == 9 || mes==11){
                dias = 30;
            } else{
                dias = 31;
            }
        }   
        
        //SAIDA
        System.out.println("o Mês " +mes+ " tem: " +dias+ " Dias.");
    }
}
