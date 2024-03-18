/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa que calcula a média simples de três notas 
        fornecidas pelo usuário.*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é: " + media);
    }
    
}
