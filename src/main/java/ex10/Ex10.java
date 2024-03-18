/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que converta a temperatura 
        dada em Fahrenheit para Celsius.  
        Para testar se a sua resposta está correta saiba 
        que 100ºC = 212F. Considere C/5 = (F-32)/9*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit é igual a " + celsius + " Celsius.");
    }
    
}
