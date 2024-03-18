/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um algoritmo que lê o salário de um funcionário, 
        reajusta o salário em 7% e mostra o resultado.*/

        Scanner scanner = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Informe o salário do funcionário:");
        salario = scanner.nextDouble();

        novoSalario = salario * 1.07;

        System.out.println("O salário reajustado é R$ " + novoSalario);
    }

}
