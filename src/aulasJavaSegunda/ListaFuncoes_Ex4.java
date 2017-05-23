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
public class ListaFuncoes_Ex4 {
    public static void main(String[] args) {
        int n = 5;
        int a = fatorial(n);
        int b = somatoria(n);
        System.out.println(fatoriaDSomatoria(a,b));
    }
    
    public static int somatoria(int n){
        int count = 0;
        int resultado = 0;
        
        while(count <= n){
            resultado = resultado + count;
            count++;
        }
        return resultado;
        
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
    
    public static int fatoriaDSomatoria(int a, int b){
        return a / b;
    }
}
