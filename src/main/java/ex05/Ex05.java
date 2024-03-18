/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que lê um valor real em dólar, 
        e converte o valor para reais. 
        Considere que a cotação é US$ 1 = R$ 4,95.*/
        
        Scanner scanner = new Scanner(System.in);
        double valorDolar, valorReal, cotacao = 4.95;
        
        System.out.println("Digite o valor em dólar:");
        valorDolar = scanner.nextDouble();
        
        valorReal = valorDolar * cotacao;
        
        System.out.printf("US$ %.2f convertido para reais é: R$ %.2f", valorDolar, valorReal);
    }
    
}
