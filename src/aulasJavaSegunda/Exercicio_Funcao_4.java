/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasJavaSegunda;

/**
 *
 * @author roberto.jwsilva
 */
public class Exercicio_Funcao_4 {
    public static void main(String[] args) {
        System.out.println(calcula(8));
    }
    static double calcula(double x){
        double total = 0;
        if(x < -1){
            total = x + 2;
        }else if(-1 <= x && x <= 2){
            total = Math.sqrt(x) - 4;
        }else if(x > 2){
            total = 2 * x - 1;
        }
        return total;
    }
}
