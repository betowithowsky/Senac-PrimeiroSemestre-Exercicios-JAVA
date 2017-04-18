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
public class Relogio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean parar = false;
        int cont = 0;
        
        while(true){
        for(int h = 0; h <= 23; h++){
            for(int m = 0; m <= 59; m++){
                for (int s = 0; s <= 59; s ++){
                    System.out.printf("%d:%d:%d\n",h,m,s);
                    if(h == 23 && m == 50 && s ==50){
                        System.out.println("ALARME!!!");
                        parar = true;
                        break;
                    }
                }if(parar)
                break;
            }if(parar)
                break;
        }
        
        System.out.println("continuar?");
                cont = input.nextInt();
                if(cont == 1){
                    parar = false;
                }else{
                    break;
                }
        }
    }
  }

