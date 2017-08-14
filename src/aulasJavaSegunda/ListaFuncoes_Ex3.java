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
public class ListaFuncoes_Ex3 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }
    
    public static int fatorial(int n){
        int count = 0;
        int resultado = 0;
        
        while(count <= n){
            if(resultado <= 0)
               resultado = 1;
            else
            resultado = resultado * count;
            
            count++;
        }
        return resultado;
    }
}
