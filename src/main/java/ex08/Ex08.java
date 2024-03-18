/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que converte 
        uma quantidade de metros para centímetros.*/
        
        Scanner scanner = new Scanner(System.in);
        double metros, centimetros;
        
        System.out.println("Informe a quantidade em metros: ");
        metros = scanner.nextDouble();
        
        centimetros = metros * 100;
        
        System.out.println(metros+" metros =  "+ centimetros + " centímetros.");
    }
    
}
