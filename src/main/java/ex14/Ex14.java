/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desenvolva um programa que, dados dois valores A e B, 
        troque os valores de forma que A passe a ter o valor de B e vice-versa. 
        Exiba os valores após a troca.*/
        
        Scanner scanner = new Scanner(System.in);
        int a, b, temp;
        
        System.out.println("Digite o valor de A:");
        a = scanner.nextInt();
        
        System.out.println("Digite o valor de B:");
        b = scanner.nextInt();
        
        // Troca de valores
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Após a troca, A: " + a + " e B: " + b);
    }
    
}
