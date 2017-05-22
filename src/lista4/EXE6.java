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
public class EXE6 {
    
    public static double bhaskaramod (double a, double b, double c, double d){
        double delta = ((b*b) - ((4*a)*c));
        if (delta > 0){
           double delta2 = Math.sqrt(delta);
           double xmais = ((-b + delta2)/(2*a));
           double xmeno = ((-b - delta2)/(2*a));
           if (d == 1){
               System.out.println("A menor raiz é:");
               return xmeno;
           }else {
               System.out.println("A maior raiz é:");
               return xmais;
           }
        }else if (delta < 0){
            return -1;
        } else{
            System.out.println("Delta é igual a 0, sendo assim");
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira o valor de A: ");
        double a = console.nextDouble();
        System.out.print("Insira o valor de B: ");
        double b = console.nextDouble();
        System.out.print("Insira o valor de c: ");
        double c = console.nextDouble();
        System.out.print("Insira o valor de D (lembrando que D pode ser apenas 1 ou 2,");
        System.out.print("sendo que 1 serve para obter a maior raiz e 2 para obter a menor raiz: ");
        double d = console.nextDouble();
        double r = bhaskaramod(a, b, c, d);
        System.out.println(r);
        
    }
}
