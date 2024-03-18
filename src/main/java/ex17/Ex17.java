/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa para o seguinte problema: 
        Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, 
        obtendo-se Y reais como troco. Quanto custou cada caneta? */ 
        Scanner scanner = new Scanner(System.in);
        int n;
        double z, y, custoTotal, custoPorCaneta;
        
        System.out.println("Digite o número de canetas compradas (N):");
        n = scanner.nextInt();
        
        System.out.println("Digite o valor da nota com que foi feito o pagamento (Z) em reais:");
        z = scanner.nextDouble();
        
        System.out.println("Digite o valor do troco recebido (Y) em reais:");
        y = scanner.nextDouble();
        
        custoTotal = z - y;
        
        custoPorCaneta = custoTotal / n;
        
        System.out.printf("Cada caneta custou: %.2f reais\n", custoPorCaneta);
    
    }
    
}
