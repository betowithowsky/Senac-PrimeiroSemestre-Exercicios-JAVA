/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasjavaquinta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beto
 */
public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random gerador = new Random();
        
        int computador = gerador.nextInt(3);
        
        // 1-pedra 2-papel 3-tesoura
        System.out.println("***** Pedra, Papel ou Tesoura Game *****");
        System.out.print("Digite Pedra, Papel ou Tesoura:");
        String player = console.next();
        
        if(player.equals("pedra") && computador == 0){
            System.out.println("Pedra vs Pedra EMPATE!!");
        }else if(player.equals("pedra") && computador == 1){
            System.out.println("Pedra vs Papel PERDEU!!");
        }else if(player.equals("pedra") && computador == 2){
            System.out.println("Pedra vs Tesoura VENCEU!!");
        }
        
        else if(player.equals("papel") && computador == 0){
            System.out.println("Papel vs Pedra VENCEU!!");
        }else if(player.equals("papel") && computador == 1){
            System.out.println("Papel vs Papel EMPATE!!");
        }else if(player.equals("papel") && computador == 2){
            System.out.println("Papel vs Tesoura PERDEU!!");
        }
        
        else if(player.equals("tesoura") && computador == 0){
            System.out.println("Tesoura vs Pedra PERDEU!!");
        }else if(player.equals("tesoura") && computador == 1){
            System.out.println("Tesoura vs Papel VENCEU!!");
        }else if(player.equals("tesoura") && computador == 2){
            System.out.println("Tesoura vs Tesoura EMPATE!!");
        }
        
        System.out.println(computador);
    }
}
