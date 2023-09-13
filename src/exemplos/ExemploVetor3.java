/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author mileny.1948
 */
public class ExemploVetor3 {
     public static void main(String[] args) {
         int qtdeposicoes = 5, maior;
         
         int[] vetor = new int[qtdeposicoes];
         
         vetor[0] = 12;
         vetor[1] = 520;
         vetor[2] = 100;
         vetor[3] = 87;
         vetor[4] = 15;
         
        maior = vetor[0];
         for(int i = 0; i < vetor.length; i++){
             if(vetor[i] > maior){
                 maior = vetor[i];
             }
         }
         System.out.println("O maior valor neste vetor é: " + maior);
     }
}
