/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que lê dois números, X e Y, 
        e mostra o resto da divisão entre eles.*/
        
        Scanner scanner = new Scanner(System.in);
        int x, y, resto;
        
        System.out.println("Digite o primeiro número:");
        x = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        y = scanner.nextInt();
        
        resto = x % y;
        System.out.printf("O resto da divisão de %d por %d é:  %d", x,y,resto);
        
    }
    
}
