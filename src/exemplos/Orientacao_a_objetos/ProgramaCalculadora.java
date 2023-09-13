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
public class ProgramaCalculadora {
     public static void main(String[] args) {
         CalculadoraComum  calculadora = new CalculadoraComum();
         CalculadoraCientifica cc = new CalculadoraCientifica();
         
         Scanner scanner = new Scanner(System.in);
         
         float soma, sub, mult, div, num1, num2;
         //calculadora.subtrair(12, 10);
         
         System.out.println("Informe o primeiro número: ");
         num1 = scanner.nextFloat();
         
         System.out.println("Informe o segundo número: ");
         num2 = scanner.nextFloat();
         
        soma = calculadora.somar(num1, num2);
        sub = calculadora.subtrair(num1, num2);        
        mult = calculadora.multiplicar(num1, num2);        
        div = calculadora.dividir(num1, num2);
        
         System.out.println("Resultado da soma: " + soma);
         System.out.println("Resultado da subtração: " + sub);
         System.out.println("Resultado da Multiplicação: " + mult);
         System.out.println("resultado da divisão: " + div);
         System.out.println("-------------------------------------");
         System.out.println("Agora, informe um número para saber a raiz quadrada: ");
         Double numrq = scanner.nextDouble();
         Double rq = cc.raizQuadrada(numrq);
         System.out.println("Raiz de " + numrq + " é: " + rq);
         System.out.println("-------------------------------------");
         System.out.println("Infoeme um número: ");
         Double num = scanner.nextDouble();
         System.out.println("Informe uma potência: ");
         Double numPot = scanner.nextDouble();
         Double pow = cc.potencia(num, numPot);
         System.out.println(num + " elevado a " + numPot + " é: " +pow);
     }
}
