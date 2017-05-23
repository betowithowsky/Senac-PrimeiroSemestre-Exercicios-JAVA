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
public class ListaFuncoes_Ex2 {
    public static void main(String[] args) {
        
        System.out.println(somatoria(10));
        
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
    
}
