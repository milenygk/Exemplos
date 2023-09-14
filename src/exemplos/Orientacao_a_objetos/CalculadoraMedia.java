/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.Orientacao_a_objetos;

/**
 *
 * @author mileny.1948
 */
public class CalculadoraMedia extends CalculadoraComum{
    public float mediaAritmetica(float num1, float num2, float num3){
        return (num1 + num2 + num3) / 3;
    }
    
    public float mediaPonderada(float num4, float num5, float num6, float peso1, float peso2, float peso3){
        return (((num4 * peso1) + (num5 * peso2) + (num6 * peso3)) / (peso1 + peso2 + peso3));
    }
}
