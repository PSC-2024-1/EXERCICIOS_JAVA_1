/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que leia a idade de uma pessoa 
          e calcule quantos dias essa pessoa já viveu.*/
        
        Scanner scanner = new Scanner(System.in);
        int idade, diasVividos;
        
        System.out.println("Informe a sua idade:");
        idade = scanner.nextInt();
        
        diasVividos = idade * 365;
        
        System.out.println("Você já viveu" + diasVividos + " dias.");
    }
    
}
