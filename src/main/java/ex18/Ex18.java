/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex18;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Cada degrau de uma escada tem X de altura. 
        Faça um programa que receba essa altura e a altura que o 
        usuário deseja alcançar subindo a escada, calcule e mostre 
        quantos degraus ele deverá subir para atingir seu objetivo, 
        sem se preocupar com a altura do usuário. 
        Todas as medidas fornecidas devem estar em metros. */ 
        Scanner scanner = new Scanner(System.in);
        int numeroDegraus;
        double alturaDegrau, alturaDesejada;
        
        System.out.println("Digite a altura de cada degrau da escada (em metros):");
        alturaDegrau = scanner.nextDouble();
        
        System.out.println("Digite a altura que deseja alcançar subindo a escada (em metros):");
        alturaDesejada = scanner.nextDouble();
        
        numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau);
        
        System.out.println("Você precisa subir " + numeroDegraus + " degraus para alcançar seu objetivo.");
   
    }
    
}
