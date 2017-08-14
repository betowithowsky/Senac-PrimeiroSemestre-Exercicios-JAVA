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
public class Estrutura_Repeticao_Ex_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um Texto");
        String text = input.nextLine();
        
        String codigomorce = "";
        
        for(int i = 0; i < text.length(); i++){
            String dig = text.substring(i,i+1);
            String codigo = "";
            
            switch(dig){
                case "a":
                    codigo = " • ─ ";
                    break;
                case "b":
                    codigo = " ─ • • • ";
                    break;
                case "c":
                    codigo = " ─ • ─ • ";
                    break;
                case "d":
                    codigo = " ─ • • ";
                    break;
                case "e":
                    codigo = " • ";
                    break;
                case "f":
                    codigo = " • • ─ • ";
                    break;
                case "g":
                    codigo = " ─ ─ • ";
                    break;
                case "h":
                    codigo = " • • • • ";
                    break;
                case "i":
                    codigo = " • • ";
                    break;
                case "j":
                    codigo = " • ─ ─ ─ ";
                    break;
                case "k":
                    codigo =" ─ • ─ ";
                    break;
                case "l":
                    codigo = " • ─ • • ";
                    break;
                case "m":
                    codigo = " ─ ─ ";
                    break;
                case "n":
                    codigo = " ─ • ";
                    break;
                case "o":
                    codigo = " ─ ─ ─ ";
                    break;
                case "p":
                    codigo = " • ─ ─ • ";
                    break;
                case "q":
                    codigo = " ─ ─ • ─ ";
                    break;
                case "r":
                    codigo = " • ─ • ";
                    break;
                case "s":
                    codigo = " • • • ";
                    break;
                case "t":
                    codigo = " ─ ";
                    break;
                case "u":
                    codigo = " • • ─ ";
                    break;
                case "v":
                    codigo = " • • • ─ ";
                    break;
                case "w":
                    codigo = " • ─ ─ ";
                    break;
                case "x":
                    codigo = " ─ • • ─ ";
                    break;
                case "y":
                    codigo = " ─ • ─ ─ ";
                    break;
                case "z":
                    codigo = " ─ ─ • • ";
                    break;
                case "1":
                    codigo = " • ─ ─ ─ ─ ";
                    break;
                case "2":
                    codigo = " • • ─ ─ ─ ";
                    break;
                case "3":
                    codigo = " • • • ─ ─ ";
                    break;
                case "4":
                    codigo = " • • • • ─ ";
                    break;
                case "5":
                    codigo = " • • • • • ";
                    break;
                case "6":
                    codigo = " ─ • • • • ";
                    break;
                case "7":
                    codigo = " ─ ─ • • • ";
                    break;
                case "8":
                    codigo = " ─ ─ ─ • • ";
                    break;
                case "9":
                    codigo = " ─ ─ ─ ─ • ";
                    break;
                case "0":
                    codigo = " ─ ─ ─ ─ ─ ";
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
            codigomorce += codigo + " ";
        }
        System.out.println(codigomorce);
        
    }
}
