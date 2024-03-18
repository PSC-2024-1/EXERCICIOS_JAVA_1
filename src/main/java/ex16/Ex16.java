/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex16;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que receba de entrada a distância total (em km)
        percorrida por um automóvel e a quantidade de combustível (em litros) 
        consumida para percorrê-la, calcule e imprima o consumo médio de combustível. 
        Fórmula: distância/litro.*/
        
        Scanner scanner = new Scanner(System.in);
        double distancia, combustivel, consumoMedio;
        
        System.out.println("Digite a distância total percorrida (em km):");
        distancia = scanner.nextDouble();
        
        System.out.println("Digite a quantidade de combustível consumida (em litros):");
        combustivel = scanner.nextDouble();
        
        consumoMedio = distancia / combustivel;
        
        System.out.printf("O consumo médio de combustível é: %.2f km/l\n", consumoMedio);
    
    }
    
}
