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
 * @author roberto.jwsilva
 */
public class Sorteio {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner console = new Scanner(System.in);
        
        int i = rng.nextInt(10);
        
        System.out.println(i);
    }
}
