/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex19;

/**
 *
 * @author rafaelamoreira
 */
public class Ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que calcule os quadrados e 
        cubos dos números de 0 a 10 e imprima os valores 
        resultantes em formato de tabela como a seguir:*/
        
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Quadrado", "Cubo");
        
        System.out.printf("%-10d %-10d %-10d%n", 0, (0*0), (0*0*0));
        System.out.printf("%-10d %-10d %-10d%n", 1, (1*1), (1*1*1));
        System.out.printf("%-10d %-10d %-10d%n", 2, (2*2), (2*2*2));
        System.out.printf("%-10d %-10d %-10d%n", 3, (3*3), (3*3*3));
        System.out.printf("%-10d %-10d %-10d%n", 4, (4*4), (4*4*4));
        System.out.printf("%-10d %-10d %-10d%n", 5, (5*5), (5*5*5));
        System.out.printf("%-10d %-10d %-10d%n", 6, (6*6), (6*6*6));
        System.out.printf("%-10d %-10d %-10d%n", 7, (7*7), (7*7*7));
        System.out.printf("%-10d %-10d %-10d%n", 8, (8*8), (8*8*8));
        System.out.printf("%-10d %-10d %-10d%n", 9, (9*9), (9*9*9));
        System.out.printf("%-10d %-10d %-10d%n", 10, (10*10), (10*10*10));
    }
    
}
