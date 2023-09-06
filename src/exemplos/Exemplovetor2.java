/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class Exemplovetor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Informe o valor para posição [" + i + "]");
            numeros[1] = scanner.nextInt();
        }
        
        System.out.println("--------VALORES INFORMADOS---------");
        for(int i = 0; i < 5; i++){
            System.out.println("valor na posição [" + i + "]:" + numeros[i]);
        }
    }
}
