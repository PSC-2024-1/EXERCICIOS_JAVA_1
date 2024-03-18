/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex20;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escrever um algoritmo que lê: - a porcentagem do 
        IPI a ser acrescido no valor das peças - o código da peça 1, 
        valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, 
        valor unitário da peça 2, quantidade de peças 2. 
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.*/
        
        Scanner scanner = new Scanner(System.in);
        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double ipi, valorUnitarioPeca1, valorUnitarioPeca2, valorTotal;
        
        System.out.println("Digite a porcentagem do IPI a ser acrescido:");
        ipi = scanner.nextDouble();
        
        System.out.println("Digite o código da peça 1, valor unitário da peça 1 e quantidade de peças 1:");
        codigoPeca1 = scanner.nextInt();
        valorUnitarioPeca1 = scanner.nextDouble();
        quantidadePeca1 = scanner.nextInt();
        
        System.out.println("Digite o código da peça 2, valor unitário da peça 2 e quantidade de peças 2:");
        codigoPeca2 = scanner.nextInt();
        valorUnitarioPeca2 = scanner.nextDouble();
        quantidadePeca2 = scanner.nextInt();
        
        valorTotal = ((valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2)) * (1 + ipi / 100);
       
    }
    
}
