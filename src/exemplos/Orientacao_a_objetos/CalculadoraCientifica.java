/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.Orientacao_a_objetos;

/**
 *
 * @author mileny.1948
 */
public class CalculadoraCientifica extends CalculadoraComum {
    public Double raizQuadrada(Double a){
        return Math.sqrt(a);
    }
    
    public Double potencia(Double a, Double b){
         return Math.pow(a ,b);
    }   
}
