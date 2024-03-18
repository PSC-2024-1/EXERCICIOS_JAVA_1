/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ex01;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex01 {

    public static void main(String[] args) {
        /* Crie um programa que solicita ao usuário dois números 
        e, em seguida, mostra a soma desses números.*/
        
        Scanner scanner = new Scanner(System.in);
        int num1, num2, soma;
        
        System.out.println("Digite o primeiro número:");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número:");
        num2 = scanner.nextInt();
        
        soma = num1 + num2;
        System.out.println("A soma é: " + soma);

    }
}
