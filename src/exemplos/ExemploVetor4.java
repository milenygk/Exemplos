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
public class ExemploVetor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
         
        nomes[0] = "Mileny";
        nomes[1] = "Jean";
        nomes[2] = "Helena";
        nomes[3] = "Jorge";
        nomes[4] = "Theo";
         
        System.out.println("Informe o nome: ");
        String nome = scanner.next();
        boolean naLista = false;
         
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals(nome)){
                naLista = true;
                System.out.println("O nome " + nome + " esta na lista");
                break;
            }  
        }
        
        if(naLista == false){
            System.out.println("O nome não está na lista");
        }
    }
}

