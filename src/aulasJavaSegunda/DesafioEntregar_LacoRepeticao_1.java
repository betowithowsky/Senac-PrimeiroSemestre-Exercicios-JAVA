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
public class DesafioEntregar_LacoRepeticao_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean parar = false;
        
        System.out.println("Digite o Dia de 1 a 7(1 = domingo, 7 = sabado):");
        int dia = input.nextInt();
        System.out.println("Digite a Hora:");
        int hr = input.nextInt();
        System.out.println("Digite o Minuto:");
        int min = input.nextInt();
        System.out.println("Digite o Segundo:");
        int sec = input.nextInt();
        
        while(true){
        for(int d = 1; d <= 7; d++){
            System.out.println("Dia: "+d);
            for(int h = 0; h <= 23; h++){
                for(int m = 0; m <= 59; m++){
                    for (int s = 0; s <= 59; s ++){
                        System.out.printf("%d:%d:%d\n",h,m,s);
                        if(d == dia && h == hr && m == min && s == sec){
                            System.out.printf("Dia: %d Hora: %d:%d:%d\n",d,h,m,s);
                            parar = true;
                            break;
                        }
                    }if(parar)
                      break;
                }if(parar)
                  break;
            }if(parar)
               break;
        }if(parar)
          break;

        }
    }
}
