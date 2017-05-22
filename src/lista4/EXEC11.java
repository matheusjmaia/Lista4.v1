/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXEC11 {
    
        static String conceito (double nota){
        if (nota >=0.0 && nota <= 4.9){
            return "Conceito D";
        } else if (nota >=5.0 && nota <= 6.9){
            return "Conceito C";
        } else if (nota >=7.0 && nota <= 8.9){
            return "Conceito B";
        } else {
            return "Conceito A";
        }
    }
    
    public static void main(String[] args) {
         Scanner console = new Scanner (System.in);
         System.out.println("Insira a nota");
         double nota = console.nextDouble();
         String conceito = conceito(nota);
         System.out.println(conceito);
    }
}
