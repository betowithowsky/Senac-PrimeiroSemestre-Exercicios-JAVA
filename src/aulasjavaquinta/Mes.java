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
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        //ENTRADA
        System.out.print("Mês: ");
        int dias;
        int mes = console.nextInt();
        String nomeMes = "";
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
        
        if(mes == 1){
            nomeMes = "Janeiro";
        }else if(mes == 2){
            nomeMes = "Fevereiro";
        }else if(mes == 3){
            nomeMes = "Março";
        }else if(mes == 4){
            nomeMes = "Abril";
        }else if(mes == 5){
            nomeMes = "Maio";
        }else if(mes == 6){
            nomeMes = "Junho";
        }else if(mes == 7){
            nomeMes = "Julho";
        }else if(mes == 8){
            nomeMes = "Agosto";
        }else if(mes == 9){
            nomeMes = "Setembro";
        }else if(mes == 10){
            nomeMes = "Outubro";
        }else if(mes == 11){
            nomeMes = "Novembro";
        }else if(mes == 12){
            nomeMes = "Dezembro";
        }
        
        //SAIDA
        if(mes < 1 || mes > 12){
            System.out.println("Não Existe Mês: " +mes);
        }else{
            System.out.println("o Mês de " +nomeMes+ " tem: " +dias+ " Dias.");
        }
    }
}
