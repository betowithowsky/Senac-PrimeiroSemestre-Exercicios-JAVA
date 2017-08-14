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
public class Exercicio_Login {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    
        String login;
        String senha;
    
        System.out.print("Digite Seu Login: ");
        login = console.nextLine();
        System.out.print("Digite Sua Senha: ");
        senha = console.nextLine();
        
        if(login.equals ("guilherme") && senha.equals("0f5") || login.equals("jair") && senha.equals("0706")){
            System.out.println("Bem Vindo " +login);
        }
        else if(login.equals("") && senha.equals("")){
            System.out.println("Digite uma senha e um Login");
        }
        else{
            System.out.println("Erro, Login ou Senha invalidos.");
        }
    }

}
