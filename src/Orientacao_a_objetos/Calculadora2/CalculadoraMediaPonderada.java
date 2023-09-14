/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Orientacao_a_objetos.Calculadora2;

/**
 *
 * @author mileny.1948
 */
public class CalculadoraMediaPonderada extends CalculadoraMediaAritmetica {
     private double[] valores;
     private double[] pesos;
     
  public CalculadoraMediaPonderada() {
    }
  
  public CalculadoraMediaPonderada(double[] valores, double[] pesos) {
        this.valores = valores;
        this.pesos = pesos;
    }
  
   public double calcularMedia() {
        if (valores.length != pesos.length) {
        throw new IllegalArgumentException("O número de valores deve ser igual ao número de pesos.");
        }
        double soma = 0;
        double somaPesos = 0;
   
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i] * pesos[i];
            somaPesos += pesos[i];
        }
            return soma / somaPesos;
}
}
