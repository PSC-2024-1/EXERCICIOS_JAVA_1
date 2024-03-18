/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desenvolva um programa que calcula a área de um círculo, 
        onde o raio é fornecido pelo usuário.*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
    
}
