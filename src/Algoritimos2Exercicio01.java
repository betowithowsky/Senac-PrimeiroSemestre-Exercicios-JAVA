
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Beto
 */
public class Algoritimos2Exercicio01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um Numero: ");
        int num = input.nextInt();
        
        System.out.println(ParOuImpar(num));
    }
    
    public static boolean ParOuImpar(int num){
        boolean ParImpar = false;
       if(num % 2 == 0){
           ParImpar = true;
       }
       return ParImpar;  
}
}
