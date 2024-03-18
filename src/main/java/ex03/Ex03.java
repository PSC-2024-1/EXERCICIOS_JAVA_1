/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que leia o primeiro nome 
        do usuário e escreva uma saudação para ele.*/
        Scanner scanner = new Scanner(System.in);
        String nome; 
        
        System.out.println("Informe o seu nome:");
        nome = scanner.next();
        
        System.out.println("Olá, " + nome + "! Seja-bem vindo(a)!");

    }
    
}
