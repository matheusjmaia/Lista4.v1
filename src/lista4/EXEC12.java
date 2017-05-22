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

public class EXEC12 {
    
    public static double pesoIdeal (double alt, String sexo){
        
        if (sexo.equalsIgnoreCase("f")){
            return ((62.1 * alt)- 44.7);
        }else if (sexo.equalsIgnoreCase("m")){
            return ((72.67 * alt)- 58.0);
        } else {
            System.out.println("Sexo inválido");
            return 0.0; }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira a altura: ");
        double alt = console.nextDouble();
        System.out.println("para o sexo, digite 'M' para masculino ou 'F' para feminino");
        String sexo = console.next();
        double pesoId = pesoIdeal(alt, sexo);
        System.out.println("O peso ideal seria de: "+pesoId+ " quilos.");
    }
}