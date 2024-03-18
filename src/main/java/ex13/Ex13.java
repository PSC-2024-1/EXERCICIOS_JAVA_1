/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que calcula o 
        salário líquido de um funcionário. 
        O programa deve solicitar o valor da hora de trabalho, 
        o número de horas trabalhadas no mês e o percentual de desconto do INSS.*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da hora de trabalho:");
        double valorHora = scanner.nextDouble();
        
        System.out.println("Digite o número de horas trabalhadas no mês:");
        int horasTrabalhadas = scanner.nextInt();
        
        System.out.println("Digite o percentual de desconto do INSS:");
        double percentualINSS = scanner.nextDouble();
        
        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoINSS = salarioBruto * percentualINSS / 100;
        double salarioLiquido = salarioBruto - descontoINSS;
        
        System.out.println("O salário líquido é: " + salarioLiquido);
    }
    
}
