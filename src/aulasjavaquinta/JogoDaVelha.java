/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("é a vez que qual jogador? (X ou O)");
        String player = console.next();
        
        int position;
        
        System.out.println(" 1 | 2 | 3 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 7 | 8 | 9 ");
        
        System.out.println("Digite a Posição que quer Jogar:");
        position = console.nextInt();
        
        if(position == 1) {
         System.out.println(" "+player+" |   |   ");
        }else if(position == 2) {
         System.out.println("   | "+player+" |   ");
        }else if(position == 3) {
         System.out.println("   |  | "+player+" ");
        }else{
         System.out.println("   |   |  ");
         System.out.println("---+---+---");
        }
        
        if(position == 4) {
         System.out.println(" "+player+" |   |   ");
        }else if(position == 5) {
         System.out.println("   | "+player+" |   ");
        }else if(position == 6) {
         System.out.println("   |  | "+player+" ");
        }else{
         System.out.println("---+---+---");
         System.out.println("   |   |  ");
        }
        
        if(position == 7) {
         System.out.println(" "+player+" |   |   ");
        }else if(position == 8) {
         System.out.println("   | "+player+" |   ");
        }else if(position == 9) {
         System.out.println("   |  | "+player+" ");
        }else{
         System.out.println("---+---+---");
         System.out.println("   |   |  ");
        }
    }
}
