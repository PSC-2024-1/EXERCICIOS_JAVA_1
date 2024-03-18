/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex15;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Construa um programa que calcule as raízes 
        de uma equação de 2º grau (Ax2+Bx+C). 
        Sendo que os valores A,B e C são fornecidos pelo usuário. 
        Considere que tem duas raízes.*/
        
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
                
        System.out.println("Digite o valor de A:");
        a = scanner.nextDouble();
        
        System.out.println("Digite o valor de B:");
        b = scanner.nextDouble();
        
        System.out.println("Digite o valor de C:");
        c = scanner.nextDouble();
        
        delta = Math.pow(b, 2) - (4 * a * c);
        
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("x1: " + x1 + " e x2: " + x2);
          
    }
    
}
