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
public class JogoDaVelhaCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String player;
        
        int posPlayer;
        
        boolean win = false;
        
        String pos1 = "1";
        String pos2 = "2";
        String pos3 = "3";
        String pos4 = "4";
        String pos5 = "5";
        String pos6 = "6";
        String pos7 = "7";
        String pos8 = "8";
        String pos9 = "9";
        
        System.out.printf(" %s | %s | %s \n",pos1,pos2,pos3);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n",pos4,pos5,pos6);
        System.out.printf("---+---+---\n");
        System.out.printf(" %s | %s | %s \n",pos7,pos8,pos9);
        
        System.out.println("Digite quem vai jogar primeiro (X ou O):");
        player = input.nextLine();
        
        int tentativas = 0;
        
        while (win == false){
            System.out.println("Digite a Posição do "+player+":");            
            posPlayer = input.nextInt();
            
            boolean podeContinuar = true;
            if(posPlayer == 1 && pos1.equals("1")){
                pos1 = player;
            }else if(posPlayer == 2 && pos2.equals("2")){
                pos2 = player;
            }else if(posPlayer == 3 && pos3.equals("3")){
                pos3 = player;
            }else if(posPlayer == 4 && pos4.equals("4")){
                pos4 = player;
            }else if(posPlayer == 5 && pos5.equals("5")){
                pos5 = player;
            }else if(posPlayer == 6 && pos6.equals("6")){
                pos6 = player;
            }else if(posPlayer == 7 && pos7.equals("7")){
                pos7 = player;
            }else if(posPlayer == 8 && pos8.equals("8")){
                pos8 = player;
            }else if(posPlayer == 9 && pos9.equals("9")){
                pos9 = player;
            }else{
                podeContinuar = false;
                System.out.println("Essa Posição ja foi Escolhida, tente novamente!");
            }
            
            if(podeContinuar){
                System.out.printf(" %s | %s | %s \n",pos1,pos2,pos3);
                System.out.printf("---+---+---\n");
                System.out.printf(" %s | %s | %s \n",pos4,pos5,pos6);
                System.out.printf("---+---+---\n");
                System.out.printf(" %s | %s | %s \n",pos7,pos8,pos9);

                if(pos1.equals("X") && pos2.equals("X") && pos3.equals("X") ||
                    pos4.equals("X") && pos5.equals("X") && pos6.equals("X") ||
                    pos7.equals("X") && pos8.equals("X") && pos9.equals("X") ||
                    pos1.equals("X") && pos4.equals("X") && pos7.equals("X") ||
                    pos2.equals("X") && pos5.equals("X") && pos8.equals("X") ||
                    pos3.equals("X") && pos6.equals("X") && pos9.equals("X") ||
                    pos1.equals("X") && pos5.equals("X") && pos9.equals("X") ||
                    pos3.equals("X") && pos5.equals("X") && pos7.equals("X")){
                    win = true;
                    System.out.println("Parabéns o X venceu!");
                    break;
                }else if(pos1.equals("O") && pos2.equals("O") && pos3.equals("O") ||
                    pos4.equals("O") && pos5.equals("O") && pos6.equals("O") ||
                    pos7.equals("O") && pos8.equals("O") && pos9.equals("O") ||
                    pos1.equals("O") && pos4.equals("O") && pos7.equals("O") ||
                    pos2.equals("O") && pos5.equals("O") && pos8.equals("O") ||
                    pos3.equals("O") && pos6.equals("O") && pos9.equals("O") ||
                    pos1.equals("O") && pos5.equals("O") && pos9.equals("O") ||
                    pos3.equals("O") && pos5.equals("O") && pos7.equals("O")){
                    win = true;
                    System.out.println("Parabéns o O Venceu!");
                    break;               
                }   
                if(player.equals("X")){
                    player = "O";
                }else if(player.equals("O")){
                    player = "X";
                }
                tentativas ++;
            }
            if(tentativas >= 9){
                System.out.println("Deu Velha!!!");
                break;
            }
            
        }
    }
}
