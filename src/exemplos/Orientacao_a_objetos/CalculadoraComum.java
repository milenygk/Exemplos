/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos.Orientacao_a_objetos;

/**
 *
 * @author mileny.1948
 */
public class CalculadoraComum {
    private float resultado;

    public CalculadoraComum() {
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public float somar(float a, float b){
      // setResultado(a + b);   
      return a + b;
    }
    
    public float subtrair(float a, float b){
     //  setResultado(a - b);
     return a - b;
    }
    
    public float multiplicar(float a, float b){
      // setResultado(a * b);
      return a * b;
    }
    
    public float dividir(float a, float b){
        if(a > 0)
            return a / b;
        //   setResultado(a / b); 
        else{
            System.out.println("Erro: divisão por zeo!");
           // setResultado(Float.NaN);
           return Float.NaN; 
        }
    }
}
