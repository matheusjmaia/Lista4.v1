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
public class EXEC10 {
    
        static String categoria (int idade){
        if (idade >=5 && idade <= 7){
            return "Infantil A";
        } else if (idade >=8 && idade <=10){
            return "Infantil B";
        } else if (idade >=11 && idade <=13){
            return "Juvenil A";
        } else if (idade >=14 && idade <=17){
            return "Juvenil B";
        }else{
            return "Adulto";
        }
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira a idade do nadador: ");
        int n = console.nextInt();
        String categoria = categoria(n);
        System.out.println("Categoria "+categoria);
    }
}
