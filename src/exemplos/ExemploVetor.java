/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author mileny.1948
 */
public class ExemploVetor {
     public static void main(String[] args) {
        int[] numeros = new int[5];
        
        numeros[0] = 12;
        numeros[1] = 50;
        numeros[2] = 78;
        numeros[3] = 140;
        numeros[4] = 6;
        
        int soma = 0;
        for(int i = 0; i < 5; i++){
           // System.out.println("Numeros na posiçaõ" + i + " possui o valor " + numeros[i]); 
           soma = soma + numeros[i]; 
        }
         System.out.println(soma);
     }
}
