/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que solicite o nome, 
        o endereço e o telefone do usuário e 
        depois mostra os dados digitados.*/
        Scanner scanner = new Scanner(System.in);
        String nome, endereco, telefone;
        
        System.out.println("Informe o seu nome:");
        nome = scanner.nextLine();
        
        System.out.println("Informe o seu endereço:");
        endereco = scanner.nextLine();
        
        System.out.println("Informe o seu telefone:");
        telefone = scanner.nextLine();
        
        System.out.println("--------------------------");
        System.out.println("Dados do usuário");
        System.out.println("--------------------------");
        System.out.println("Nome: "+ nome);
        System.out.println("Endereço: "+ endereco);
        System.out.println("Telefone: "+ telefone);
    }
    
}
