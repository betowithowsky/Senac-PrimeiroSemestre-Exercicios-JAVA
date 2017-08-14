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
public class ListaFuncoes_Ex5 {
    public static void main(String[] args) {
        System.out.println(maiorRaiz(1,-4,5));
    }
    
    public static double maiorRaiz(int a, int b, int c){
     double delta = (b*b) - (4*a*c);
        if(delta < 0){
            System.out.println("Não existe Raiz Real");
            return -1;
        }else if(delta == 0)
            return 0;
        
        double x1 =  (- b + Math.sqrt(delta)) / (2*a);
        double x2 =  (- b - Math.sqrt(delta)) / (2*a);
           
                if (x1 < x2) {
                return x2;
            }
        return x1;

   
    }
}
