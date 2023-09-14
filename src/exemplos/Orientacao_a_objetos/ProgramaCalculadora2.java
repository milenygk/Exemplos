/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.Orientacao_a_objetos;

import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class ProgramaCalculadora2 {
    public static void main(String args[]){
        CalculadoraMedia cm = new CalculadoraMedia();
        
        float media;
        
        media = cm.mediaAritmetica(31, 35, 55);
      
         System.out.println("Resultado da média aritmetica: " + media);

        media = cm.mediaPonderada(32, 52, 66, 2, 4, 5);
        
         System.out.println("Resultado da média ponderada: " + media);
    }
}
