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
public class Connecta4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
        desenhaTabuleiro();
    }

    private static void desenhaTabuleiro() {
        String[][] tabuleiro = new String[6][7];
        
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = ".";
            }
        }
        System.out.println();
        for (int coluna = 0; coluna <= tabuleiro.length; coluna++) {
            System.out.print(" " + coluna + " ");
        }
        System.out.println();
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                System.out.print("|" + tabuleiro[l][c] + "|");
            }
            System.out.println();
        }  
    }
}
