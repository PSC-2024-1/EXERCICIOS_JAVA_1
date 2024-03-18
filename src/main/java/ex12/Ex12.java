/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa para ler um valor e 
        escrever o seu antecessor e o seu sucessor.*/
        
        Scanner scanner = new Scanner(System.in);
        double num, antecessor, sucessor; 
        
        System.out.println("Digite um número:");
        num = scanner.nextDouble();
        
        antecessor = num - 1;
        sucessor = num + 1;
        
        System.out.println("A antecessor de "+ num + "é "+antecessor+ "e o sucessor é "+ sucessor);

    }
    
}
