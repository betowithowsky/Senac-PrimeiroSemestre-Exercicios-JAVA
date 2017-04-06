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
public class SalarioPlanoCarreiraSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o Nome do Funcionario:");
        String nome = input.nextLine();
        System.out.println("Digite seu Nivel 1, 2 ,3 ,4 ,5:");
        int nivel = input.nextInt();
        System.out.print("Digite a Quantidade de Horas Trabalhada:");
        double horas = input.nextDouble();
        
        double salario = 0;
        
        switch(nivel){
            case 1:
                salario = horas * 15.00;
                System.out.printf("O Funcionario %s, trabalhou %.2f Horas por R$ 15,00(Nivel: %d) e deve receber R$: %.2f\n",
                        nome,
                        horas,
                        nivel,
                        salario);
                break;
            case 2:
                salario = horas * 18.00;
                System.out.printf("O Funcionario %s, trabalhou %.2f Horas por R$ 15,00(Nivel: %d) e deve receber R$: %.2f\n",
                        nome,
                        horas,
                        nivel,
                        salario);
                break;
            case 3:
                salario = horas * 22.00;
                System.out.printf("O Funcionario %s, trabalhou %.2f Horas por R$ 15,00(Nivel: %d) e deve receber R$: %.2f\n",
                        nome,
                        horas,
                        nivel,
                        salario);
                break;
            case 4:
                salario = horas * 27.00;
                System.out.printf("O Funcionario %s, trabalhou %.2f Horas por R$ 15,00(Nivel: %d) e deve receber R$: %.2f\n",
                        nome,
                        horas,
                        nivel,
                        salario);
                break;
            case 5:
                salario = horas * 33.00;
                System.out.printf("O Funcionario %s, trabalhou %.2f Horas por R$ 15,00(Nivel: %d) e deve receber R$: %.2f\n",
                        nome,
                        horas,
                        nivel,
                        salario);
                break;
            default:
                System.out.println("Nivel não existente!!!\n");
        }
    }
}
